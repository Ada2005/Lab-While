package While;
import java.util.*;


public class ZeroCount {
	public static void main(String[] args) {
	
		// Kol-vo "0" v binarnyh chislah
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number: ");
		int n = sc.nextInt();
		int [] arr = new int[8];
		try {
			for (int i = arr.length - 1; i >= 0; i--) {
				arr[i] = n % 2;
				n = n / 2;
			}
			int count = 0;
			for (int i : arr) {
				if (i == 0) {
					count++;
				}
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println(count);
		} catch (Exception e) {
			System.out.println("Qate ===>" + e);
		}
	}
}
		