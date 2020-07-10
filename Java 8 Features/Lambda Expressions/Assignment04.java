/*Create an interface WordCount with a single abstract method int count(String str), to count and return the no of words in the given String. 
Implement count method using Lambda expression in another class MyClassWithLambda.
Invoke it to display the result on the console.
*/

interface WordCount {
    int count(String str);
}

public class Assignment04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordCount wc = str -> {
			return (str.split(" ").length);
		};
		System.out.println(wc.count("This is a test"));
	}

}
