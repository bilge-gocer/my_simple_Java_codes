
import java.util.Scanner;

public class FahrToCel {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter temperature in fahrenheit :");
		double fahrenheit =in.nextDouble();
		double celsius = (fahrenheit-32)*5/9;
		System.out.println("Temperature is "+celsius+" celcius degrees.");
		
	}

}
