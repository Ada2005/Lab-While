package While;
import java.util.*;


public class LetterNumber {
	public static void main(String[] args) {
	
		// Kol-vo bukv, cifr, probelov
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input text: ");
		char[] text = sc.nextLine().toCharArray();
		int cDigit = 0, cLetter = 0, cSpace = 0;
		for (char ch : text) {
			if (Character.isDigit(ch)) {
				cDigit++;
			} else if (Character.isLetter(ch)) {
				cLetter++;
			} else if (Character.isSpace(ch)) {
				cSpace++;
			}
		}
			System.out.println("Sentence \"" + "\" has " + cDigit + "\t" + cLetter + "\t" + cSpace);
		}
	}
				