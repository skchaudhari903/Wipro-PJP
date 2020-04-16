/*Create a Collection called HashMap which is capable of storing String objects. The program should have the following abilities
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		
		map.put("India", "Delhi");
		map.put("Japan", "Tokyo");
		map.put("Bangladesh", "Dhaka");
		
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Map.Entry<String, String> me = itr.next();
			
			if (me.getKey().equals("Japan")) {
				System.out.println("Key Japan exists");
				break;
			}
		}
		
    	set = map.entrySet();
		itr = set.iterator();
		
		while (itr.hasNext()) {
			Map.Entry<String, String> me = itr.next();
			
			if (me.getValue().equals("Delhi")) {
				System.out.println("Value Delhi exists");
				break;
			}
		}
		
		set = map.entrySet();
		itr = set.iterator();
		
		while (itr.hasNext()) {
			Map.Entry<String, String> me = itr.next();
			System.out.println(me);
		}
	}

}
