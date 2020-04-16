/*Create a Collection “ContactList” using HashMap to store name and phone number of contacts added. The program should use appropriate generics (String, Integer) and have the following abilities:
a) Check if a particular key exists or not. 
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class ContactList {
	HashMap<String, Integer> contacts = new HashMap<>();
	
	public void addContact(String name, Integer number) {
		contacts.put(name, number);
	}
	
	public void removeContact(String name) {
		contacts.remove(name);
	}

	@Override
	public String toString() {
		return "ContactList [contacts=" + contacts + "]";
	}
	
	public boolean doesContactNameExist(String name) {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<String, Integer> e = itr.next();
			
			if (e.getKey().equals(name)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean doesContactNumberExist(Integer number) {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Entry<String, Integer> e = it.next();

			//System.out.println(me.getValue() + " == " + number + " :: " + (me.getValue() == number));
			if (e.getValue().intValue() == number) {
				return true;
			}
		}
		
		return false;
	}
	
	public void listAllContacts() {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Entry<String, Integer> e = it.next();
			System.out.println(e);
		}
	}
}

public class Assignment04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactList contactsList = new ContactList();
		
		contactsList.addContact("Ajay", 98310983);
		contactsList.addContact("Police", 100);
		contactsList.addContact("Vijay", 98765432);
				
		System.out.println("Police: " + contactsList.doesContactNameExist("Police"));
		System.out.println("98765432: " + contactsList.doesContactNumberExist(98765432));
		
		System.out.println();
		contactsList.listAllContacts();
	}

}
