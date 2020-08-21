/*Given an ArrayList containing 10 words, write a program to reverse each word and 
update the same ArrayList , with the help of Consumer.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Assignment06 {
	
	static String revString(String str) {
        StringBuffer sbr = new StringBuffer();
        sbr.append(str);
        return sbr.reverse().toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words = new ArrayList<>(Arrays.asList(
				"Shubham", "Tejas", "Shreya", "Vicky", "Amit", "Rakesh", "Ajay", "Vijay", "Amay", "Pooja"));
		ArrayList<String> revWords = new ArrayList<>();
		Consumer<String> rev = str -> revWords.add(revString(str));
		words.forEach(str -> rev.accept(str));
		words = revWords;
		words.forEach(System.out::println);
	}

}
