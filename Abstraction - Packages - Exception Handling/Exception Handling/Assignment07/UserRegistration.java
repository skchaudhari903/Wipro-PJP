/*A student portal provides user to register their profile. During registration the system needs to validate the user should be located in India. If not the system should throw an exception.

Step 1: Create a user defined exception class named “InvalidCountryException”.
Step 2: Overload the respective constructors.
Step 3: Create a main class “UserRegistration”, add the following method,
void registerUser(String username,String userCountry) with the below implementation
• if userCountry is not equal to  “India” throw a InvalidCountryException with the message “User Outside India  cannot be registered”
• if userCountry is equal to  “India”,  print the message “User registration done successfully”

Invoke the method registerUser from the main method with the data specified and see how the program behaves.
Example1)
i/p:Mickey,US 
o/p:InvalidCountryException should be thrown.
The message should be “User Outside India  cannot be registered”

Example2)
i/p:Mini,India
o/p:User registration done successfully
*/

import java.util.Scanner;

class InvalidCountryException extends Exception {
	public InvalidCountryException() {
		System.out.println("InvalidCountryException occured");
		System.out.println("User Outside India cannot be registered");
	}
}

public class UserRegistration {

	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");	
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "", countryName = "";
		System.out.print("Enter the name of user :");
		name = scan.nextLine();
		System.out.print("Enter country name :");
		countryName = scan.nextLine();
		UserRegistration registration = new UserRegistration();
		try {
			registration.registerUser(name, countryName);
		} 
		catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}

}
