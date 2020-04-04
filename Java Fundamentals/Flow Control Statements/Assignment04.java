/*Initialize two character variables in a program and display the characters in alphabetical order.

Example1) if the first character is 's' and second character is 'e' then the output should be  e,s

Example2) if the first character is 'a' and second character is 'e', then the output should be a,e
*/

public class Assignment04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char var1 = 's';
		char var2 = 'e';
		
		if (var1 > var2)
            System.out.println(var2+" , "+var1);
        else
            System.out.println(var1+" , "+var2);
	}

}
