/*Create an interface Test with an abstract method "int myFunction".
This function takes three integer parameters.

Write a program to create two Test reference variables t1 and t2.
t1 should add three integer parameters and t2 should multiply three integer parameters, using lambda expression.

Call myFunction using t1 and t2 reference variables, by passing three integer values and print the result.
 */

interface Test {
	int myFunction(int x, int y, int z);
}

public class Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = (x, y, z) -> (x + y + z);
		Test t2 = (x, y, z) -> (x * y * z);
		
		System.out.println(t1.myFunction(10, 20, 30));
		System.out.println(t2.myFunction(10, 20, 30));
	}

}
