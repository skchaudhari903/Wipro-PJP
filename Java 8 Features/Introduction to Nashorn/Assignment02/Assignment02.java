/*Write a JavaScript function which accepts a number and returns true if it is a prime number else returns false.
Save the code as Demo.js, invoke the function from a Java program and display the result. 
*/

import javax.script.*;
import java.io.FileReader;

class Assignment02{
	
	public static void main(String[] args){
		try{
			ScriptEngine nashorn = new ScriptEngineManager().getEngineByName("nashorn");
			nashorn.eval(new FileReader("Demo.js"));
			Invocable invocable = (Invocable) nashorn;
			System.out.println(invocable.invokeFunction("isPrime",24));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}		
}