package While;
import java.util.*;
import java.io.*;

public class Task01 {
	
	public static void main(String[] args) {
	
		double i = 0, a, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите значение a: ");
		a = sc.nextInt();
		System.out.println("¬ведите значение n: ");
		n = sc.nextInt();
		while (i < n) {
			i = Math.pow(a,n);
			}
		System.out.println(i);
	}
}
