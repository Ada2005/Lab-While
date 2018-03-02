package While;
import java.util.*;

import javax.management.relation.RelationServiceNotRegisteredException;


public class SameWord {
	public static void main(String[] args) {
	
		// Pohojee slovo
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input text: ");
		String[] text = sc.nextLine().split(" ");
		int count1 = 0, count2 = 0;
		
		for (int i = 0; i < text.length; i++) {
			count1 = 0;
			for (int j = 0; j < text.length; j++) {
				if (text[i].equalsIgnoreCase(text[j])) {
					count1++;
				}
			}
			if (count1 == 1) {
				count2++;
			}
		}
		System.out.println(count2);
	}
}