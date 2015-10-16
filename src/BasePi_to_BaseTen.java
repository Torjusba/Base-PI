//import java.util.Scanner;

public class BasePi_to_BaseTen {
	public String toTen(String number) {
		
		String digits = "0123";
		Double result = 0.0;
		
		int pow = number.indexOf('.');
		if (pow == -1)
			pow = number.length() - 1;
		else
			pow--;
			
		for (int i = 0; i < number.length(); i++) {
			char c = number.charAt(i)
			if (c == '.')
				continue; 
				
			int digit = digits.indexOf(c);
			if (digit == -1)
				return "Invalid digit";
				
			result += digit * Math.pow(Math.PI, pow--);
		}
		
		return Double.toString(result);
	}	
}
