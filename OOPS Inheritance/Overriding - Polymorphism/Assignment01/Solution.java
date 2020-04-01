/*Create  a base class Fruit with name ,taste and size as its attributes. 

Create a method called eat() which describes the name of the fruit and its taste. 

Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.
*/

class Fruit {
	String name, taste, size;
	
	void eat() {
		System.out.println("Eating Fruits...");
	}
}

class Apple extends Fruit {
	
	Apple() {
		name = "Apple";
		taste = "sweet and caramelized";
	}
	
	@Override
	void eat() {
		System.out.println(name + " is "+ taste + " in taste.");
	}
}

class Orange extends Fruit {
	
	Orange() {
		name = "Orange";
		taste = "sweet-tert";
	}
	
	@Override
	void eat() {
		System.out.println(name + " is "+ taste + " in taste.");
	}	
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fruit = new Fruit();
		Apple apple = new Apple();
		Orange orange = new Orange();
		fruit.eat();
		apple.eat();
		orange.eat();
		
	}

}
