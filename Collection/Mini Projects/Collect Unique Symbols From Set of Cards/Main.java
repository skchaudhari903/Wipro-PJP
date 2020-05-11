import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Card> set = new HashSet<>();
		
		for (int i = 0; i < 8; i++) {
			System.out.println("Enter a card:");
			Card card = new Card();
			
			card.setSymbol(sc.nextLine().charAt(0));
			card.setNumber(sc.nextInt());
			sc.nextLine();
			
			set.add(card);
		}
		System.out.println("Four symbols gathered in eight cards.");
		System.out.println("Cards in Set are:");
		
		
		for (Card card : set) 
			System.out.println(card.getSymbol() + " " + card.getNumber());		
		
		sc.close();
	}

}