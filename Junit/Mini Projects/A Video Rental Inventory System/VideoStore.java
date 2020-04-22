public class VideoStore {
	Video[] store;
	
	int checkVideo(String name) {
		int flag = 0;
		
		for(Video video:store) {
				if(video.getName().equals(name))
					flag = 1;
		}
		return flag;
	}
	
	public int getStoreSize() {
		if (store != null) return store.length;
		else return 0;
	}
	
	public Video getLastAdded() {
		if (store != null) return store[store.length - 1];
		else return null;
	}
	
	public void addVideo(String name) {
		int size;
		Video video = new Video(name);
		try {
			size = store.length;
		} catch (Exception e) {
			size = 0;
		}
		Video[] newStore = new Video[size + 1];
		newStore[size] = video;
		store = newStore;
	}
	
	void doCheckout(String name) {
		if(store == null || store.length == 0) {
			System.out.println("Store is empty");
			return;
		}
		for(Video video : store) {
			if(video.getName().equals(name)) {
				video.doCheckout();
			}
		}
	}
		
	void doReturn(String name) {
		if(store==null || store.length==0) {
			System.out.println("Store is empty");
			return;
		}
		for(Video video :store) {
			if(video.getName().equals(name)) {
				video.doReturn();
			}
		}
	}
	
	public void receiveRating(String name , int rating) {
		if(store==null || store.length==0) {
			System.out.println("Store is empty");
			return;
		}
		for(Video video :store) {
			if(video.getName().equals(name)) {
				video.receiveRating(rating);
			}
		}
	}
	
	public void listInventory() {
		if (store == null || store.length == 0) {
			System.out.println("Store is empty");
			return;
		}
		for (Video video : store) {
			System.out.print("---------------------------------------------------------------------------");
			System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", "Video Name","Checkout Status","Rating");
			System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", video.getName(), video.getCheckout(),video.getRating());
			System.out.println("---------------------------------------------------------------------------");
		}
	}

}
