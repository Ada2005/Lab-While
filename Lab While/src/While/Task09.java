package While;
import java.util.*;
import java.io.*;

public class Task09 {
	
	public static void main(String[] args) {
	
		// Сумма последовательности положительных чисел введенных с клавиатуры до первого нуля
		
		int s, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number s: ");
		while (true) {
		s = sc.nextInt();
		if (s>0) {
		sum += s;}
		if (s == 0) {
		break;
		}
		}
		System.out.println(sum);	
	}
}
