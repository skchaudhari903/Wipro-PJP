/*Write a java program that generates the minimum and maximum value for each of the Numeric Wrapper classes (Byte, Short, Integer, Long, Float, Double)

Sample Output:
Integer range: 
min: -2147483648 
max: 2147483647 
Double range: 
min: 4.9E-324 
max: 1.7976931348623157E308 
Long range: 
min: -9223372036854775808 
max: 9223372036854775807 
Short range: 
min: -32768 
max: 32767 
Byte range: 
min: -128 
max: 127 
Float range: 
min: 1.4E-45 
max: 3.4028235E38
*/

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Integer range:");
		System.out.println("min: " + Integer.MIN_VALUE);
		System.out.println("max: " + Integer.MAX_VALUE);

		System.out.println("Double range:");
		System.out.println("min: " + Double.MIN_VALUE);
		System.out.println("max: " + Double.MAX_VALUE);

		System.out.println("Long range:");
		System.out.println("min: " + Long.MIN_VALUE);
		System.out.println("max: " + Long.MAX_VALUE);

		System.out.println("Short range:");
		System.out.println("min: " + Short.MIN_VALUE);
		System.out.println("max: " + Short.MAX_VALUE);

		System.out.println("Byte range:");
		System.out.println("min: " + Byte.MIN_VALUE);
		System.out.println("max: " + Byte.MAX_VALUE);

		System.out.println("Float range:");
		System.out.println("min: " + Float.MIN_VALUE);
		System.out.println("max: " + Float.MAX_VALUE);
	}

}
