//Given an ArrayList containing n names, use StringJoiner to construct a new sequence of names separated by , (comma) and enclosed in { } brackets.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Java", "is", "OOP", "Language"));
		StringJoiner sj = new StringJoiner("," , "{" , "}"); 
		list.forEach(element -> sj.add(element));
		System.out.println(sj);
	}

}
