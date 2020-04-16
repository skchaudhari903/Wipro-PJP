//Implement the assignment 1 using HashTable
/*Assignment 1:
1. Develop a java class with a instance variable M1 (HashMap)  create a method saveCountryCapital(String CountryName, String capital) , the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
Key- Country                          Value - Capital
India                                 	Delhi
Japan                                   Tokyo
2. Develop a method getCapital(String CountryName) which returns the capital for the country passed, from the Map M1 created in step 1.
3. Develop a method getCountry(String capitalName) which returns the country for the capital name, passed from the Map M1 created in step 1.
4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.
Key – Capital                    Value – Country
Delhi                               	India
Tokyo                            		Japan
5. Develop a method which iterates through the map M1 and creates an ArrayList with all the Country names stored as keys. This method should return the ArrayList.
NOTE: You can test the methods using a main method.
*/

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class CountryTable {
	private Hashtable<String, String> M1;
	
	public CountryTable() {
		M1 = new Hashtable<String, String>();
	}
	
	public Hashtable<String, String> saveCountryCapital(String CountryName, String capital) {
		M1.put(CountryName, capital);
		return M1;
	}
	
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	public String getCountry(String capitalName) {
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<String, String> e = itr.next();
			
			if (e.getValue().equals(capitalName))
				return e.getKey();
		}
		return null;
	}
	
	public Hashtable<String, String> swapKyeValue() {
		Hashtable<String, String> M2 = new Hashtable<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<String, String> e = itr.next();
			M2.put(e.getValue(), e.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		
		while (itr.hasNext()) {
			Entry<String, String> e = itr.next();
			list.add(e.getKey());
		}
		return list;
	}
}

public class Assignment06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryTable countryTable = new CountryTable();

		countryTable.saveCountryCapital("India", "Delhi");
		countryTable.saveCountryCapital("Japan", "Tokyo");
		countryTable.saveCountryCapital("USA", "Washington, D.C.");
		
		System.out.println(countryTable.getCapital("India"));
		System.out.println(countryTable.getCountry("Tokyo"));
		System.out.println(countryTable.toArrayList());
		
		Hashtable<String, String> M2 = countryTable.swapKyeValue();
		System.out.println(M2);
	}

}
