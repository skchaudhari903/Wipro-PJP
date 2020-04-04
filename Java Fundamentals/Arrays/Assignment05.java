//Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.

public class Assignment05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {19, 14, 20, 18, 2};										//sort
		for(int i = 0; i < array.length-1; i++) {
			for(int j = 0; j < array.length-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Largest two numbers are "+array[array.length-1]+", "+array[array.length-2]);
		System.out.println("Smallest two numbers are "+array[0]+", "+array[1]);
	}

}
