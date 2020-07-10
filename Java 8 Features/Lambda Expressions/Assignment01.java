/*Create an ArrayList al and add 25 random numbers. 
Write a code to print all the prime numbers that are present in it, using lambda expression.
*/

import java.util.ArrayList;
import java.util.Random;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		Random random = new Random();
		for(int i = 0; i < 25; i++){
			al.add(random.nextInt(100));
		}
		System.out.println("Array : " +al.toString());
		System.out.print("Prime Nos : ");
		al.forEach(num -> {
			boolean isPrime = true;
			for (int i = 2; i <= (int) Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			System.out.print(isPrime ? num + " " : "");
		});
	}

}
