import java.math.*;
import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		while (true) {
		int num = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Number to convert: ");
		num = in.nextInt();
		
		double rest = 0;
		int pow = 0;
		int digit = 0;
		
		while (num > 0) {
			digit = num % 10;
			rest += (digit * Math.pow(Math.PI, pow++));
			num = num/10;
		}
		System.out.println(rest);
		}
	}
	
	
}
