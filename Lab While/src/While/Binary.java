package While;
import java.util.*;


public class Binary {
	public static void main(String[] args) {
	
		// Binarnyi poisk chisla
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number you need: ");
		int key = sc.nextInt();
		int [] arr = {8, 3, 10, 9, 2, 1, 6, 7, 5, 13};
		Arrays.sort(arr);
		
		if (binarySearch(key, arr)) {
			System.out.println("The entered number is in the list");
		} else System.err.println("The entered number is not in the list");
	}


	static boolean binarySearch(int key, int [] arr) {
		int sPoint = 0, ePoint = arr.length - 1, mPoint;
		while (sPoint <= ePoint) {
			mPoint = (sPoint + ePoint)/2;
			if (arr[mPoint] == key) {
				return true;
			} else if (key > arr[mPoint]) {
				sPoint = mPoint + 1;
			} else {
				ePoint = mPoint - 1;
			}
		}
		return false;
	}
}
	