//Given an ArrayList containing 10 words, write a program to filter the words which are palindrome, with the help of Predicate.
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Assignment03 {

	static boolean isPalindromeString(String input1) {
		input1 = input1.toLowerCase();
		int digitCount = input1.length();
		boolean isPalindrome = true;
		
		int range = digitCount / 2;
		if (digitCount % 2 == 0)
			range--;
		
		for (int i = 0; i <= range; i++) {
			if (input1.charAt(i) != input1.charAt(digitCount - i - 1))
				isPalindrome = false;
			}
		return isPalindrome;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words = new ArrayList<>(
                Arrays.asList("Malayalam", "valid", "Dial", "Tears", "Hard", "Racecar", "Level", "Crazy", "Madam", "Sir"));
		Predicate<String> isPal = str -> isPalindromeString(str);
		words.stream().filter(isPal).forEach(System.out :: println);
	}

}
