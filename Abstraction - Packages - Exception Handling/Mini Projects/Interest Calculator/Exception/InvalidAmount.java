package Exception;

public class InvalidAmount extends Exception{
	public InvalidAmount()
	{
		super();
		System.out.println("Please Enter Valid Amount");
	}
}
