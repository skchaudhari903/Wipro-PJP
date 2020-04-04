/*Initialize a character variable in a program and 

print 'Alphabhet' if the initialized value is an alphabhet, 

print 'Digit' if the initialized value is a number, and 

print 'Special Character', if the initialized value is anything else.
*/

public class Assignment05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char var = '@';
		
		if((var >= 65 && var <= 90) || (var >= 97 && var <= 122) ) {
			System.out.println("Alphabet");
		}
		else if(var >= 48 && var <= 57) {
			System.out.println("Number");
		}
		else {
			System.out.println("Special Character");
		}
	}

}
