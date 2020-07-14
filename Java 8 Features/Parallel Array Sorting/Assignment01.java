/*Write a program as per the below instructions:

a) Initialize an integer Array with 10 elements. 
b) Sort this array using parallelSort() method. 
c) And display the sum of min and max value of this array as result.
*/

import java.util.Arrays;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {3, 10, 2, 8, 6, 23, 15, 9, 18, 7};
		System.out.print("Array: " + Arrays.toString(array));
		Arrays.parallelSort(array);
		System.out.println("\nSum of max and min element: " + (array[0]+array[9]));
	}

}
