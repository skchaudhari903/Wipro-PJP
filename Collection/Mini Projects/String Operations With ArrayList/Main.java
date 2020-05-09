import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String S1 = "JAVAJAVA";
		String S2 = "VA";
		
		List<String> list = doOperations(S1, S2);
		
		System.out.println("Output: " + list);
	}
	
	public static List<String> doOperations(String S1, String S2) {
		List<String> list = new ArrayList<String>();
		
		// 1. Character in each alternate index of S1 should be replaced with S2
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < S1.length(); i += 2) {
			sb.append(S2);
			sb.append(S1.charAt(i));
		}
		list.add(sb.toString());
		
		// 2. If S2 appears more than once in S1, replace the last occurrence 
		// of S2 in S1 with the reverse of S2, else return S1+S2
		int occurrence = S1.split(S2, -1).length - 1;
		if (occurrence > 1)
			list.add(S1.substring(0, S1.lastIndexOf(S2)) + new StringBuilder(S2).reverse());
		
		// 3. If S2 appears more than once in S1, delete the first occurrence 
		// of S2 in S1, else return S1
		if (occurrence > 1)
			list.add(S1.substring(0, S1.indexOf(S2)) + S1.substring(S1.indexOf(S2) + S2.length(), S1.length()));
		
		// 4. Divide S2 into two halves and add the first half to the beginning of the S1 
		// and second half to the end of S1. 
		int partLength = S2.length() % 2 == 0 ? S2.length() / 2 : S2.length() / 2 + 1;
		list.add(S2.substring(0, partLength) + S1 + S2.substring(partLength, S2.length()));
		
		// 5. If S1 contains characters that is in S2 change all such characters to *
		sb = new StringBuilder();
		for (int i = 0; i < S1.length(); i++) {
			if (S2.indexOf(S1.charAt(i)) != -1)
				sb.append('*');
			else
				sb.append(S1.charAt(i));
		}
		list.add(sb.toString());
		
		return list;
	}

}