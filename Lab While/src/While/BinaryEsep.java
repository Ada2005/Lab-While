package While;
import java.util.*;


public class BinaryEsep {
	public static void main(String[] args) {
	
		// Binarnyi poisk chisla
		
		FastFor f = new FastFor();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number you need: ");
		int key = sc.nextInt();
		System.out.println();
		System.out.println(f.statusEsep(key));
	}
}
		
		