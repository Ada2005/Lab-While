package While;
import java.util.*;


public class NthPrime {
	public static void main(String[] args) {
	
		// Vvoditsja nomer prostogo chisla - yf vyhode prostoe chislo
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input N-th number: ");
		int n = sc.nextInt(), count = 0;
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) count++;
			if (count == n) {
				System.out.println(i);
				break;
			}
		}
	}
	
	static boolean isPrime (int a) {
		int counter = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) counter++;
			}
		if (counter == 0) return true;
		return false;
		}
	}
				