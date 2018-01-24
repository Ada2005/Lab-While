package While;
import java.util.*;
import java.io.*;

public class Task04 {
	
	public static void main(String[] args) {
	
		//Сумма квадратов чисел от 1 до N
		
		int i = 1, n, s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number n: ");
		n = sc.nextInt();
		while (i <= n) {
		s += (i*i);
		i++;}
		System.out.println(s);	
		}
}
