package While;
import java.util.*;
import java.io.*;

public class Task08 {
	
	public static void main(String[] args) {
	
		// Сумма последовательности чисел введенных с клавиатуры до первого нуля
		
		int s, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input numbers: ");
		while (true) {
		s = sc.nextInt();
		sum += s;
		if (s == 0) {
		break;
		}
		}
		System.out.println(sum);
	}
}
