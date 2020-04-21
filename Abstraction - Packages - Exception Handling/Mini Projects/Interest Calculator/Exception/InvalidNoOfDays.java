package Exception;

public class InvalidNoOfDays extends Exception{
	public InvalidNoOfDays()
	{
		super();
		System.out.println("Invalid Number of days. Please enter non-negative values.");
	}
}
