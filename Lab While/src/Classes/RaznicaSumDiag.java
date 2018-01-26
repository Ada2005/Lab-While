package Classes;
import java.util.*;
import java.io.*;

public class RaznicaSumDiag {
	public static void main (String[] args) {
		
		int n;
		SumDiag sd = new SumDiag();
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: " + " ");
		n = sc.nextInt();
		
		System.out.println(sd.diag(n));
		
		}
				
	}

