/*Write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome
*/

public class Assignment18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		int temp = num, digit, reverse = 0;
		
		while(temp > 0) {
			digit = temp % 10;
			reverse = reverse * 10 + digit;
			temp = temp / 10;
		}
		
		if(num == reverse) {
			System.out.println(num + " "+ "is a palindrome");
		}
		else {
			System.out.println(num + " "+ "is not a palindrome");
		}
	}

}
