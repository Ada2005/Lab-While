package While;
import java.util.*;
import java.io.*;

public class Task03 {
	
	public static void main(String[] args) {
	
		int s, i = 1, fib = 0, a = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите любое число: ");
		s = sc.nextInt();
		while (i <= s) {
		fib += a;
		a = fib - a;
		i++;
		System.out.println(fib);
		}
	}
}
