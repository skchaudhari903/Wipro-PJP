package Exception;

public class InvalidNoOfDays extends Exception{
	public InvalidNoOfDays()
	{
		super();
		System.out.println("Please Enter Valid No of Days/Month");
	}
}