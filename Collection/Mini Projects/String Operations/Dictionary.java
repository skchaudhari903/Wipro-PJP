
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Dictionary {
	private List<String> list = new ArrayList<>();
	
	public boolean insert(String item) {
		if (!list.contains(item)) {
			list.add(item);
			return true;
		}
		
		return false;
	}
	
	public boolean search(String item) {
		if (list.contains(item)) {
			return true;
		}
		
		return false;
	}
	
	public boolean delete(String item) {
		if (list.contains(item)) {
			list.remove(item);
			return true;
		}
		
		return false;
	}
	
	public void display() {
		for (String item : list)
			System.out.println(item);
	}
	
	public boolean replace(int index, String item2) {
		if (index < 0 || index >= list.size()) return false;
		list.set(index, item2);
		return true;
    }
	
	public void sort() {
		Collections.sort(list);
	}
	
	public void shuffle() {
		Collections.shuffle(list);
	}
	
	public void reverse() {
		Collections.reverse(list);
	}
	
	public int size() {
		return list.size();
	}
	
	public String get(int index) {
		return list.get(index);
	}
}