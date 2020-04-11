/*Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters. 
 Loop through the array and obtain the sum and average of all the elements and display the result. 

Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.
*/

public class MathOperation {

	public static void main(String[] args) throws ArithmeticException, NumberFormatException  {
		// TODO Auto-generated method stub
		if(args.length == 5) {
			int[] array = new int[args.length];
			int sum = 0;
			double avg = 0;
			try {
				for (int i = 0; i < args.length; i++)
					array[i] = Integer.parseInt(args[i]);
				for (int i = 0; i < array.length; i++)
					sum += array[i];
				avg = sum / array.length;
			}
			catch(Exception e){
				System.out.println(e);
			}
			System.out.println("sum: " + sum);
			System.out.println("avg: " + avg);
		}
		else {
			System.out.println("Enter 5 integers in command line");
		}
	}

}
