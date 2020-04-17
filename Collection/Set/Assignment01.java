/*Develop a java class with a instance variable H1 (HashSet)  add a method saveCountryNames(String CountryName) , the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
Develop a method getCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null. 
NOTE: You can test the methods using a main method.
*/

import java.util.HashSet;
import java.util.Iterator;

class Country {
	HashSet<String> H1 = new HashSet<>();
	
	public HashSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
	public String getCountry(String CountryName) {
		Iterator<String> itr = H1.iterator();
		
		while (itr.hasNext()) {
			if (itr.next().equals(CountryName))
				return CountryName;
		}
		return null;
	}
}

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country country = new Country();
		country.saveCountryNames("India");
		country.saveCountryNames("USA");
		country.saveCountryNames("Russia");
		country.saveCountryNames("Bangladesh");
		country.saveCountryNames("China");

		System.out.println("India: " + country.getCountry("India"));
		System.out.println("Japan: " + country.getCountry("Japan"));		
	}

}
