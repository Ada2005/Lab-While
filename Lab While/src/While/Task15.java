package While;
import java.util.*;
import java.io.*;

public class Task15 {
	
	private static Scanner sc;

	public static void main(String[] args) {
	
		// ����� ����� � ��������� �� -5 �� 5 ��������� � ���������� �� ������� ����
		
		// ����: 1 10 -4 5 -16 -5 0
		// ����� 
		
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
