/*Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class. 

public abstract String notice();

Derive FirstClass, Ladies, General, Luggage classes from the compartment class. 
Override the notice function in each of them to print notice message that is suitable to the specific type of  compartment.

Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random  number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]
*/

import java.util.Random;

abstract class Compartment {
	public abstract String notice();
}

class FirstClass extends Compartment {

	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "You are in First Class Compartment";
	}
	
}

class Ladies extends Compartment {

	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "You are in Ladies Compartment";
	}
	
}

class General extends Compartment {

	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "You are in General Compartment";
	}
	
}

class Luggage extends Compartment {

	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "You are in Lugguage Compartment";
	}
	
}

public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] compartments = new Compartment[10];

		Random random = new Random();
		
	    	for (int i = 0; i < 10; i++) {
	    		int randomNum = random.nextInt((4 - 1) + 1) + 1;
	    	
	    		if (randomNum == 1)
	    			compartments[i] = new Luggage();
	    		else if (randomNum == 2)
	    			compartments[i] = new Ladies();
	    		else if (randomNum == 3)
	    			compartments[i] = new General();
	    		else if (randomNum == 4)
	    			compartments[i] = new FirstClass();
	    	
	    		System.out.println(compartments[i].notice());
	    	}
	}

}
