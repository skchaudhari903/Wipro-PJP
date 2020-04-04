/*Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}
*/

import java.util.Arrays;

public class Assignment07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {12, 34, 12, 45, 67, 89};
		
		Arrays.sort(array);									//sort
		int[] temp = new int[array.length];
		int j = 0;											//Using temporary array
		for (int i = 0; i < array.length-1; i++){
			if (array[i] != array[i+1]){
				temp[j++] = array[i];  
			}
		}
		temp[j++] = array[array.length-1];
		for (int i = 0; i < j; i++){
			System.out.print(temp[i]+" ");  				//last element
		}
	}
	
}
/*														
		for(int i = 0; i < array.length; i++) {				//Without using temporary array
			if(i != array.length-1) {
				if(array[i] != array[i+1])
					System.out.print(array[i]+" ");
			}
			else
				System.out.println(array[i]);				//last element
		}
	}

}
*/