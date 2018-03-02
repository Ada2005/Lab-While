package While;
import java.util.*;


public class IntReverse {
	public static void main(String[] args) {
	
		// Perevernut' chislo
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int n = sc.nextInt(); //123
		int sum = 0;
		
		while (n > 0) {
			sum = sum * 10 + n % 10;
			n /= 10;
		}
		System.out.println(sum);
	}
}