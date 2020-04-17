/*Create a Collection called TreeSet which is capable of storing String objects. Then try these following operations :
a) Reverse the elements of the Collection.
b) Iterate the elements of the TreeSet using Iterator.
c) Check if a particular element exists or not.
*/

import java.util.Iterator;
import java.util.TreeSet;

public class Assignment03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<>();
		set.add("Bob");
		set.add("John");
		set.add("Alice");
        	set.add("Richard");
        
        	System.out.println("Original tree set:" + set);  
        	Iterator itr1 = set.descendingIterator();
        	System.out.println("Elements in Reverse Order:");
        	while (itr1.hasNext()) {
       			System.out.println(itr1.next());
        	}
		
		Iterator<String> itr2 = set.iterator();
		String query = "Sahil";
		boolean result = false;
		
		while (itr2.hasNext()) {
			if (itr2.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");
	}

}
