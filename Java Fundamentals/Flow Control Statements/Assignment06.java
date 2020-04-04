/*Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.

If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.
*/

public class Assignment06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = Integer.parseInt(args[1]);
		
		if(args[0].equals("Female")) {
			if(age >= 1 && age <= 58) {
				System.out.println("the percentage of interest is 8.2%");
			}
			else {
				System.out.println("the percentage of interest is 9.2%");
			}
		}
		else {
			if(age >= 1 && age <= 58) {
				System.out.println("the percentage of interest is 8.4%");
			}
			else {
				System.out.println("the percentage of interest is 10.5%");
			}
		}
	}

}
