//Write a program to initialize an integer array and print the sum and average of the array.

import java.util.Arrays;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {19, 14, 20, 18, 2};	//initialised an array..
		int sum = 0;	//Assuming sum count from 0
		
		System.out.println("Array: "+Arrays.toString(array)); 		//print Array
		
		for(int i = 0; i < array.length; i++) {				//summing up all the elements of the array
			sum = sum + array[i];
		}
		System.out.println("The sum of the array is: "+sum);
		double avg = (sum/array.length);						//average of the array
		System.out.println("The average of the array is: "+avg);	
	}

}
