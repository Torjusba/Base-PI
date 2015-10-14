import java.util.Scanner;

public class BasePi_to_BaseTen {
	public static void main(String[] args) {
		while (true) {
//Initialize variables
			double num = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Number to convert to base Ten: ");
		num = in.nextDouble();
		double result = 0;
		int pow = 0;
		int digit = 0;

//Convert to Base Pi
		while (num > 0) {
			digit = (int)num % 10;
			result += (digit * Math.pow(Math.PI, pow++));
			num = num/10;
		}
		System.out.println(result);
		}
	}
	
	
}
