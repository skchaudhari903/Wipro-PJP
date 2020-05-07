import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dictionary dictionary = new Dictionary();
		
		int choice = 0;
		String item;
		int index;
		
		do {
			System.out.println("MAIN MENU");
			System.out.println("---------");
			System.out.println("1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("5. Replace");
			System.out.println("6. Sort");
			System.out.println("7. Shuffle");
			System.out.println("8. Reverse");
			System.out.println("9. Exit");
			System.out.print("Enter your choice (1..9): ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				System.out.print("Enter the item to be inserted: ");
				//item = sc.nextLine();
				if (dictionary.insert(sc.nextLine()))
					System.out.println("Inserted successfully.");
				else
					System.out.println("Already exists.");
				break;
				
			case 2:
				System.out.print("Enter the item to search: ");
				if (dictionary.search(sc.nextLine()))
					System.out.println("Item found in the list.");
				else
					System.out.println("Item not found in the list.");
				break;
				
			case 3:
				System.out.print("Enter the item to delete: ");
				if (dictionary.delete(sc.nextLine()))
					System.out.println("Deleted successfully.");
				else
					System.out.println("Item does not exist.");
				break;
				
			case 4:
				System.out.println("The Items in the list are: ");
				dictionary.display();
				break;
				
			case 5:
				System.out.println("There are " + dictionary.size() + 
					" elements in the list.");				
				do {
					System.out.println("That’s an Invalid element.");
					System.out.print("Enter the index (0 to " + 
							(dictionary.size() - 1) + ") that you want to replace: ");
					index = sc.nextInt();
				} while (index < 0 || index >= dictionary.size());
				System.out.println("Element at index " + index + 
						" is " + dictionary.get(index) + ".");
				sc.nextLine();
				System.out.print("What do you want to replace it with? ");
				item = sc.nextLine();
				
				if (dictionary.replace(index, item))
					System.out.println("Item replaced successfully.");
				else
					System.out.println("Item replace failed.");
				break;
				
			case 6:
				dictionary.sort();
				System.out.println("The elements have been sorted in ascending order.");
				break;
				
			case 7:
				dictionary.shuffle();
				System.out.println("The elements have been shuffled randomly.");
				break;
				
			case 8:
				dictionary.reverse();
				System.out.println("The position of the elements have been reversed.");
				break;
				
			case 9:
				System.out.println("Exiting. . . Thanks for using the application!!");
			}
			
		} while (choice != 9);
		
		sc.close();
	}

}