package While;
import java.util.*;
import java.io.*;

public class Task02 {
	
	public static void main(String[] args) {
	
		int fact = 1, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите значение x: ");
		x = sc.nextInt();
		for (int i = 1; i<=x; i++) {
		fact *= i;
		}
		System.out.println (fact);}
}
