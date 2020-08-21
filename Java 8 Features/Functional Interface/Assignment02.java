//Given an ArrayList containing 10 numbers, write a program to calculate the sum of all the elements, with the help of Function.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8, 3, 11, 7, 4, 2, 20, 23, 12, 10));
		
		Function<ArrayList<Integer>, Integer> func = all -> {
			int sum = 0;
			for(int element : all){
				sum += element;
			}
			return sum;
		};
		
		System.out.println(func.apply(list));
	}

}
