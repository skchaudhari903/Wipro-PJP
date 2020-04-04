/*Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.


Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers

Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P: 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222
*/

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 9) {
			System.out.println("Please enter 9 integer numbers");
		}
		else {
			int[][] array = new int[3][3];
			int x = 0;
			//storing elements
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					array[i][j] = Integer.parseInt(args[x++]);
				}
			}
			
			System.out.println("The given array is :");				
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					System.out.print(array[i][j] + "\t");
				}
				System.out.println();
			}
			int max = 0;
			for(int i = 0; i < array.length; i++) {
				for(int j = 0;j < array.length; j++) {
					if(array[i][j] > max)
						max = array[i][j];
				}
			}
			System.out.println("The biggest number in the given array is "+max);
		}
	}

}
