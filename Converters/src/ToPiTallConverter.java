import java.math.*;
import java.util.Scanner;

public class ToPiTallConverter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (true)
		{
		double num = 0;
		System.out.println("Number: ");
		try {
			num = in.nextDouble();
		} finally {
			in.close();
		}
		int a = 0;
		int x;
		double y;
		double ans = 0;
		
		//Find amount of digits
		while (true) { 
			if ((num / Math.pow(Math.PI, a+1)) >= 1) {
				a++;
			}else{
				break;
			}
		}
		System.out.println(a);
		//Calculate digits
		for(int i = a; i >=0; i--) {
			x = (int)(num/Math.pow(Math.PI, i));
			y = (double)x;
			num -= x * Math.pow(Math.PI, i);
			ans += (y*Math.pow(10, i));
		}
		ans += num;
		System.out.println(ans);
	}
	}
}
