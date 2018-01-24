package Classes;
import java.util.*;
import java.io.*;

public class CalcMet {
	
	public double krug (int a) {
		return 3.1415*a*a;
	}
	
	public double pryam (int a, int b) {
		return a * b;
	}
	
	public double treug (int a, int b, int c) {
		return Math.sqrt(((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c));
	}
}
