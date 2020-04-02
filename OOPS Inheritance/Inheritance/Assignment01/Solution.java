/*Create a class named ‘Animal’ which includes methods like eat() and sleep().

Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().

Create an instance of Animal class and invoke the eat and sleep methods using this object.

Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.
*/

package Inheritance.Assignment01;

class Animal {
	void eat() {
		System.out.println("Animal is eating");
	}
	void sleep() {
		System.out.println("Animal is sleeping");
	}
}

class Bird extends Animal {
	@Override
	void eat() {
		System.out.println("Bird is eating");
	}
	@Override
	void sleep() {
		System.out.println("Bird is sleeping");
	}
	void fly() {
		System.out.println("Bird is flying");
	}
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
	}

}
