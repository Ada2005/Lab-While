package While;
import java.util.*;
import java.io.*;

public class Task13 {
	
	public static void main(String[] args) {
	
		// Произведение последовательности положительных чисел введенных с клавиатуры до первого нуля
		
		int s, sum = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number s: ");
		while (true) {
		s = sc.nextInt();
		if (s > 0) {
		sum *= s;}
		if (s == 0) {
		break;
		}
		}
		System.out.println(sum);	
	}
}
