/*Create an abstract class Instrument which is having the abstract function play. 

Create three more sub classes from Instrument which is Piano, Flute, Guitar. 
Override the play method inside all three classes printing a message 
“Piano is playing  tan tan tan tan  ”  for Piano class
“Flute is playing  toot toot toot toot”  for Flute class
“Guitar is playing  tin  tin  tin ”  for Guitar class 

Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of  play method.
Use the instanceof operator to print which object is stored at which index of instrument array.
*/

import java.util.Random;

abstract class Instrument {
	abstract void play();
}

class Piano extends Instrument {

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Piano is playing tan tan tan tan ");
	}
	
}

class Flute extends Instrument {

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Flute is playing toot toot toot toot ");	
	}
	
}

class Guitar extends Instrument {

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Piano is playing tin tin tin ");
	}
	
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Instrument[] instruments = new Instrument[10];
		
		Random random = new Random();
	    
	    	for (int i = 0; i < 10; i++) {
	    		int randomNum = random.nextInt((3 - 1) + 1) + 1;
	    	
	    		if (randomNum == 1)
	    			instruments[i] = new Piano();
	    		else if (randomNum == 2)
	    			instruments[i] = new Flute();
	    		else if (randomNum == 3)
	    			instruments[i] = new Guitar();
	    	}
		// checking polymorphic behaviour
	    	for (int i = 0; i < 10; i++) {
            		if(instruments[i] instanceof Piano)
                		System.out.print("Instrument " + i + " is of type Piano, ");
            		if(instruments[i] instanceof Flute)
                		System.out.print("Instrument " + i + " is of type Flute, ");
            		if(instruments[i] instanceof Guitar)
                		System.out.print("Instrument "+ i + " is of type Guitar, ");
            		instruments[i].play();
            	}
	}

}
