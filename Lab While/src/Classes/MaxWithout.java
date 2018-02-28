package Classes;

import java.util.Scanner;

public class MaxWithout {
	public static void main (String[] args) {
		System.out.println("Enter a, b: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Max value is: " + max(a,b));
	}
	
	static int max(int a, int b) {
		return ((a/b)*a + (b/a)*b)/(a/b + b/a);
	}
}
