/*Write a program as per the below instructions:

Initialize an integer Array with 10 elements. 
Sort only first 5 elements in this array using parallelSort() method and display the sorted array.
*/

import java.util.Arrays;

public class Assignment03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {3, 10, 2, 8, 6, 23, 15, 9, 18, 7};
		System.out.print("Before sorting: " + Arrays.toString(array));
		Arrays.parallelSort(array, 0, 5);
		System.out.print("\nAfter sorting: " + Arrays.toString(array));
	}

}
