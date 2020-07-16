/*Given two StringJoiners s1 and s2 which contains n city names separated by - (hyphen), display the output for the given cases:

i) s1 merged to s2.
ii) s2 merged to s1.
*/

import java.util.StringJoiner;

public class Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner s1 = new StringJoiner("-");
		s1.add("Pune");
		s1.add("Bangalore");
		s1.add("Indore");
		StringJoiner s2 = new StringJoiner("-");
		s2.add("Hyderabad");
		s2.add("Mumbai");
		s2.add("Chennai");
		
		System.out.println(s1.merge(s2));
		System.out.println(s2.merge(s1));					//s2 merged with modified s1
	}

}
