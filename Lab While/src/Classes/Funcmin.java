package Classes;

public class Funcmin {
		
	//simple version
	
/*	static int minimum (int a, int b, int c, int d) {           
		return Math.min(Math.min(a, b), Math.min(c, d));
	}
*/	
	
	static int minimum (int a, int b, int c, int d) {
		int min1, min2, min;
		if (a <= b) {
			min1 = a;
		} else min1 = b;
		if (c <= d) {
			min2 = c;
		} else min2 = d;
		if (min1 < min2) {
			min = min1;
		} else min = min2;
	
		return min;
	}

}
