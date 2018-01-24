package Classes;
import java.util.*;
import java.io.*;

public class MyFirstClass {
	public static void main (String[] args) {
		
		MySecondClass cl = new MySecondClass();
		int a, b;
		String amal;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some oper: ");
		amal = sc.nextLine();
		System.out.println("Enter number: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (amal.equals("+")) {
			System.out.println(cl.add(a, b));
		}
		else if (amal.equals("-")) {
			System.out.println(cl.min(a, b));
		} 
		else if (amal.equals("*")) {
			System.out.println(cl.mul(a, b));
		}
		else if (amal.equals("/")) {
			System.out.println(cl.div(a, b));
		}
		else if (amal.equals("%")) {
			System.out.println(cl.mod(a, b));
		}
		else {
			System.out.println("Invalid operation");
		}
	}
}
