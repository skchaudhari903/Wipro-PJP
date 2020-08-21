/*Given an ArrayList containing 10 numbers, write a program using Consumer methods to display each number and whether is it odd or even.
Example: For number 2, it should print "2 even" For number 5, it should print "5 odd"
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Assignment07 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(24, 10, 25, 47, 39, 20, 7, 48, 63, 51));
		
		Consumer<ArrayList<Integer>> c = num -> num.forEach(
				i -> System.out.println(i + (i % 2 == 0 ?" even":" odd")));
		
		c.accept(list);
	}

}
