/*Define your own class with a static method "int digitCount(int n)" which should return the number of digits in a given input "n". 
Define your own functional interface to refer this static method and invoke it to get the number of digits.
*/

interface DigitReference {
	int countDigit( int n);
}

public class Assignment02 {
	
	static int digitCount(int n) {
		return (int)Math.log10(n) + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitReference ref = Assignment02 :: digitCount;
		System.out.println(ref.countDigit(5342));
		System.out.println(ref.countDigit(32));
	}

}
