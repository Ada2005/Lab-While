package While;
import java.util.*;
import java.io.*;

public class Task15 {
	
	private static Scanner sc;

	public static void main(String[] args) {
	
		// Поиск чисел в интервале от -5 до 5 введенных с клавиатуры до первого нуля
		
		// ввод: 1 10 -4 5 -16 -5 0
		// вывод 
		
		int s;
		sc = new Scanner(System.in);
		System.out.println("Input number s: ");
		while (true) {
		s = sc.nextInt();
		if (s >=-5 && s <=5 && s != 0) {
		System.out.print(s + " ");}
		if (s == 0) {
		break;
		}
		}
		}
}
