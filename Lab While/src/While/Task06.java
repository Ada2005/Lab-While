package While;
import java.util.*;
import java.io.*;

public class Task06 {
	
	public static void main(String[] args) {
	
		// Сумма квадратов четных и кубов нечетных от 1 до N
		
		int i = 0, j = 1, n, s = 0, b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number n: ");
		n = sc.nextInt();
		while (i <= n) {
		s += (i*i);
		i += 2;}
		while (j <= n) {
		b += (j*j*j);
		j += 2;}
		System.out.println(s+b);
		}
}
