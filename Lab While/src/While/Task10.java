package While;
import java.util.*;
import java.io.*;

public class Task10 {
	
	public static void main(String[] args) {
	
		// ����� ������������������ ������������� ����� ��������� � ���������� �� ������� ����
		
		int s, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number s: ");
		while (true) {
		s = sc.nextInt();
		if (s<0) {
		sum += s;}
		if (s == 0) {
		break;
		}
		}
		System.out.println(sum);	
	}
}
