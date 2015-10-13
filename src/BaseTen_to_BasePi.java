import java.util.Scanner;

public class BaseTen_to_BasePi {
	public static void main(String[] args) {

		while (true) {
			// Initialize variables
			double num = 0;
			System.out.println("Number to convert to base Ten: ");
			Scanner in = new Scanner(System.in);
			try {
				num = in.nextDouble();
			} finally {}
			int a = 0;
			int x;
			double answer = 0;

			// Find amount of digits
			while (true) {
				if ((num / Math.pow(Math.PI, a + 1)) >= 1) {
					a++;
				} else {
					break;
				}
			}

			// Calculate digits
			for (int i = a; i >= -10; i--) {
				x = (int) (num / Math.pow(Math.PI, i));
				num -= x * Math.pow(Math.PI, i);
				answer += ((double) x * Math.pow(10, i));
			}
			System.out.println(answer);
		}
	}
}
