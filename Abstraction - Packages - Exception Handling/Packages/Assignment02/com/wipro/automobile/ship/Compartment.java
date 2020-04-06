/*Add the following ideas to the previous hands on: 
Create FourWheeler subpackage under automobile package
Logan class extends com.automobile.Vehicle class
public int speed()
– Returns the current speed of the vehicle.
public int gps() 
– provides facility to control the gps device 

Ford class extends  com.automobile.Vehicle class
public int speed()
– Returns the current speed of the vehicle.
public int tempControl() 
– provides facility to control the air conditioning device which is available in the car
Create objects of the relevant classes and test the various functionalities of the class.
*/

package com.wipro.automobile.ship;

public class Compartment {
	private double height;
	private double width;
	private double breadth;
	
	public Compartment(double height, double width, double breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Compartment [height=" + height + ", width=" + width + ", breadth=" + breadth + "]";
	}
}
