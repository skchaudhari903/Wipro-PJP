//Write a program to store a group of employee names into a HashSet, retrieve the elements one by one using an Iterator.

import java.util.HashSet;
import java.util.Iterator;

public class Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		
		set.add("Alice");
		set.add("Bob");
		set.add("John");
		set.add("Richard");
		
		Iterator<String> itr = set.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

}
