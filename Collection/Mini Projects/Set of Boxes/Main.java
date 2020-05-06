import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Box> set = new TreeSet<>();
		
		System.out.println("Enter the number of Box");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			Box box = new Box();
			System.out.println("Enter the Box " + i + " details");
			
			System.out.println("Enter Length");
			box.setLength(sc.nextDouble());
			System.out.println("Enter Width");
			box.setWidth(sc.nextDouble());
			System.out.println("Enter Height");
			box.setHeight(sc.nextDouble());
			
			set.add(box);
		}
		
		System.out.println("Unique Boxes in the Set are");
		for (Box box : set)
			System.out.println(box);

		sc.close();
	}

}