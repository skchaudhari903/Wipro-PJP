/*An online library application need to be created for two types of users/roles-Adults and children. 
 Both of these users should be able to register an account. 

Any user who is less than 12 years of age will be registered as a child and they can borrow a “Kids” category book for 10 days, 
whereas an adult can borrow “Fiction” category books which need to be returned within 7 days. 

Note: In future, more users/roles might be added to the library where similar rules will be enforced. 

Develop Interfaces and classes for the categories mentioned above. 

1. Create an interface LibraryUser with the following methods 
void registerAccount()
void requestBook()

2. Create 2 classes “KidUsers” and “AdultUser” which implements the LibraryUser interface.

3. Both the classes should have two instance variables - age(int),bookType(String)

4. The methods in the KidUser class should perform the following logic. 

registerAccount():

if age < 12, a message displaying “You have successfully registered under a Kids Account” should be displayed in the console. 

If(age>12), a message displaying, “Sorry, Age must be less than 12 to register as a kid” should be displayed in the console. 

requestBook():

if bookType is “Kids”, a message displaying “Book Issued successfully, please return the book within 10 days” should be displayed in the console,else, a message displaying, “Oops, you are allowed to take only kids books” should be displayed in the console.

5. The methods in the AdultUser class should perform the following logic. 

registerAccount():

if age > 12, a message displaying “You have successfully registered under an Adult Account” should be displayed in the console.

If age<12, a message displaying, “Sorry, Age must be greater than 12 to register as an adult” should be displayed in the console.


requestBook function:

if bookType is “Fiction”, a message displaying “Book Issued successfully, please return the book within 7 days” should be displayed in the console., else, a message displaying, “Oops, you are allowed to take only adult Fiction books” should be displayed in the console.

6. Create a class “LibraryInterfaceDemo.java” with a main method and test the functionalities by creating objects of KidUser and AdultUser classes.
*/

interface LibraryUser {
	void registerAccount();
	void requestBook();
}

class KidUser implements LibraryUser {
	private int age;
	private String bookType;
	
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age = age;
	}
	public void setBookType(String book) {
		// TODO Auto-generated method stub
		this.bookType = book;
	}
	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if(age < 12)
			System.out.println("You have successfully registered under a Kids Account");
		else
			System.out.println("Sorry, Age must be less than 12 to register as a kid");		
	}
	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(bookType.equals("Kids"))
			System.out.println("Book Issued successfully, please return the book within 10 days");
		else
			System.out.println("Oops, you are allowed to take only kids books");
	}
	
}

class AdultUser implements LibraryUser {
	private int age;
	private String bookType;
	
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age = age;
	}
	public void setBookType(String book) {
		// TODO Auto-generated method stub
		this.bookType = book;
	}
	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if(age > 12)
			System.out.println("You have successfully registered under a Adult Account");
		else
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
	}
	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(bookType.equals("Fiction"))
			System.out.println("Book Issued successfully, please return the book within 7 days");
		else
			System.out.println("Oops, you are allowed to take only adult Fiction books");
	}

}

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KidUser kidUsers = new KidUser();
		kidUsers.setAge(10);
		kidUsers.setBookType("Kids");
		kidUsers.registerAccount();
		kidUsers.requestBook();
		kidUsers.setAge(14);	
		kidUsers.setBookType("Fiction");		
		kidUsers.registerAccount();
		kidUsers.requestBook();
		System.out.println();
		
		AdultUser adultUser = new AdultUser();
		adultUser.setAge(5);
		adultUser.setBookType("Kids");
		adultUser.registerAccount();
		adultUser.requestBook();
		adultUser.setAge(55);	
		adultUser.setBookType("Fiction");		
		adultUser.registerAccount();
		adultUser.requestBook();
		
	}

}
