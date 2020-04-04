/*Write a program to receive a number and print the corresponding month name.

Example1)

C:\>java Sample 12

O/P Expected : December

Example2)

C:\>java Sample 

O/P Expected : Please enter the month in numbers

Example3)

C:\>java Sample 15

O/P Expected : Invalid month
*/

public class Assignment09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch(args[0]) {
		case "1":
			System.out.println("January");
			break;
		
		case "2":
			System.out.println("February");
			break;
	
		case "3":
			System.out.println("March");
			break;

		case "4":
			System.out.println("April");
			break;
			
		case "5":
			System.out.println("May");
			break;
		
		case "6":
			System.out.println("June");
			break;
			
		case "7":
			System.out.println("July");
			break;
			
		case "8":
			System.out.println("August");
			break;
			
		case "9":
			System.out.println("September");
			break;
			
		case "10":
			System.out.println("October");
			break;
			
		case "11":
			System.out.println("November");
			break;
			
		case "12":
			System.out.println("December");
			break;
			
		default:
			System.out.println("Invalid Month");
		}
	}

}
