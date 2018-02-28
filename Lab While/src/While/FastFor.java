package While;

import java.util.Arrays;

public class FastFor {
	public static int [] arr = {5, 8, 1, 4, 3, 7, 0, 9, 2, 6};
	
	public static boolean statusEsep(int n) {
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		boolean result = false, status = true;
		
		int spoint = 0, epoint = arr.length - 1, mpoint = (spoint + epoint) / 2;
		
		while (status) {
			if (n > arr[epoint]) {
				status = false;
				result = false;
			} else {
				if (n == arr[mpoint]) {
				result = true;
				status = false;
			}
			else if (n > arr[mpoint]) {
					spoint = mpoint + 1;
					mpoint = (spoint + epoint) / 2;
				} else if (n < arr[mpoint]) {
					epoint = mpoint - 1;
					mpoint = (spoint + epoint) / 2; 
				}
			}
	}
		System.out.println();
		return result;
	}

}
