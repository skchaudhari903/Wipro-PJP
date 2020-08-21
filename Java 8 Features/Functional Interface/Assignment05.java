/*Given an ArrayList containing 10 numbers, write a program to filter the perfect square numbers.
Example for perfect square numbers: 0, 1, 4, 9, 16, 25, 36, 49, 64 etc..
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Assignment05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 14, 16, 35, 4, 64, 20, 121, 25, 1));
		
		Predicate<Integer> p = i -> ((Math.sqrt(i) - Math.floor(Math.sqrt(i))) == 0) ? true : false;
		ArrayList<Integer> res = new ArrayList<>();
		list.forEach(
		i -> {
			if(p.test(i))res.add(i);
			}
		);
		System.out.println(res);
	}

}
