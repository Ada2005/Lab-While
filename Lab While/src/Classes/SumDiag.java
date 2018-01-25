package Classes;
import java.util.*;
import java.io.*;

public class SumDiag {
		
	int diag (int n) {
		int sumgl = 0, sumpb = 0, k = 1;
		int[][] arr = new int[n][n];	// the array must be square
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = r.nextInt(9) + 1;
			}
		}
		
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if (i == j) {
				sumgl += arr[i][j];
				}
			
			if (j == arr.length-k) {				// ne uchteno && j != i 
				sumpb += arr[i][j];
				}
			}
		k++;
		}
	System.out.println("summa glavnoi diagonali = " + sumgl);
	System.out.println("summa pobochnoi diagonali = " + sumpb);
	System.out.print(sumgl + " - " + sumpb + " = ");
		return sumgl - sumpb;
	}
}
