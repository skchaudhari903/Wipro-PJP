import java.util.Scanner;
public class VideoLauncher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VideoStore store = new VideoStore();
		int choice = 0;
		
		do {
			System.out.println("\n1. Add Videos: \n" + 
								"2. Check Out Video: \n" + 
								"3. Return Video: \n" + 
								"4. Receive Rating: \n" + 
								"5. List Inventory: \n" + 
								"6. Exit: \n" + 
								"Enter your choice (1..6): ");
			choice = sc.hasNextInt() ? sc.nextInt() : 6;
			sc.nextLine();
			
			String name;
			
			switch (choice) {			
			case 1:
				System.out.println("Enter the name of the video you want to Add: ");
				name = sc.nextLine();
				store.addVideo(name);
				System.out.println("Video " + name + " added out successfully.");
				break;
			case 2:
				System.out.println("Enter the name of the video you want to Checkout: ");
				name = sc.nextLine();
				store.doCheckout(name);
				System.out.println("Video " + name + " checked out successfully.");
				break;
			case 3:
				System.out.println("Enter the name of the video you want to Return: ");
				name = sc.nextLine();
				store.doReturn(name);
				System.out.println("Video " + name + " returned successfully.");
				break;
			case 4:
				System.out.println("Enter the name of the video you want to Rate: ");
				name = sc.nextLine();
				System.out.println("Enter the rating for this video: ");
				int rating = sc.nextInt();
				store.receiveRating(name, rating);
				System.out.println("Rating " + rating + " has been mapped to the Video " + name + ".");
				break;
			case 5:
				store.listInventory();
				break;
			default:
				System.out.println("Exiting...!! Thanks for using the application.");
				break;
			}
		} while (choice != 6);

		sc.close();
	}

}
