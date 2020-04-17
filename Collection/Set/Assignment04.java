//Implement the assignment 1 using TreeSet
/*Assignment 1: Develop a java class with a instance variable H1 (HashSet)  add a method saveCountryNames(String CountryName) , the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
Develop a method getCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null. 
NOTE: You can test the methods using a main method.
*/

import java.util.Iterator;
import java.util.TreeSet;

class CountrySet {
	TreeSet<String> H1 = new TreeSet<>();
	
	public TreeSet<String> saveCountryNames(String countryName) {
		H1.add(countryName);
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


public class Assignment04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountrySet country = new CountrySet();
		country.saveCountryNames("India");
		country.saveCountryNames("USA");
		country.saveCountryNames("Russia");
		country.saveCountryNames("Bangladesh");
		country.saveCountryNames("China");

		System.out.println("India: " + country.getCountry("India"));
		System.out.println("Japan: " + country.getCountry("Japan"));
	}

}