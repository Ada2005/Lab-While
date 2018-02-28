package While;
import java.util.*;


public class Task16 {
	
	private static Scanner sc;

	public static void main(String[] args) {
	
		// Найти сумму разрядов многозначных чисел 
		
		// ввод: 7 534
		// вывод 19
		
		int num, sum = 0;
		
		sc = new Scanner(System.in);
		System.out.println("Input number: ");
		num = sc.nextInt();
		
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
	
		System.out.println(sum);
	}
}
