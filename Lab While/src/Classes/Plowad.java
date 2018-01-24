package Classes;
import java.util.*;
import java.io.*;

public class Plowad {
	public static void main (String[] args) {
		
		CalcMet cm = new CalcMet();
		int a, b, c;
					
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println("Площадь круга = " + cm.krug(a));
		System.out.println("Площадь прямоугольника = " + cm.pryam(a, b));
		System.out.println("Площадь треугольника = " + cm.treug(a, b, c));
	}
}
