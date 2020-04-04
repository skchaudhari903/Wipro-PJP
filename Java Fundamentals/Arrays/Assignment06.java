//Write a program to initialize an array and print them in a sorted order.

import java.util.Arrays;

public class Assignment06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {19, 14, 20, 18, 2};
		
		Arrays.sort(array);												//sort inbuilt function
		
		/*for(int i = 0; i < array.length-1; i++) {						//sort logic
			for(int j = 0; j < array.length-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		*/
		
		System.out.print("Sorted Array : ");
		for(int element : array) {
			System.out.print(element + " ");
		}
	}

}
