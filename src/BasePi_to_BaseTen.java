import java.util.Scanner;

public class BasePi_to_BaseTen {
	public static void main(String[] args) {
		while (true) {
//Initialize variables
			int num = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Number to convert to base Ten: ");
		num = in.nextInt();
		double result = 0;
		int pow = 0;
		int digit = 0;

//Convert to Base Pi
		while (num > 0) {
			digit = num % 10;
			result += (digit * Math.pow(Math.PI, pow++));
			num = num/10;
		}
		System.out.println(result);
		}
	}
	
	
}
