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
		
		System.out.println("������� ����� = " + cm.krug(a));
		System.out.println("������� �������������� = " + cm.pryam(a, b));
		System.out.println("������� ������������ = " + cm.treug(a, b, c));
	}
}
