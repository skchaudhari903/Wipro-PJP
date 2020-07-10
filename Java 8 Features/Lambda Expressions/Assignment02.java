/*Create an ArrayList al and add 10 different words. 
Write a code to print all the Strings in reverse order, using lambda expression.
*/

import java.util.ArrayList;

public class Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StringBuffer> al = new ArrayList<StringBuffer>();
		String[] wordsArray = { "Java", "Python", "C++", "C", "JavaScript", "Go", "Rust", "Bash", "Haskell", "Ruby" };
		
		for (String word : wordsArray) {
			StringBuffer sb = new StringBuffer(word);
			al.add(sb);
		}
		al.forEach(word -> System.out.print(word.reverse() + " "));
	}

}
