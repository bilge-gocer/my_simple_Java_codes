import java.util.Scanner;

public class InputOtput {

	
	
	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number1 = in.nextInt();
		System.out.println("Please enter another number: ");
		int number2 = in.nextInt();
		
		
		int multiply = number1*number2;
		
		System.out.println("Multiply for your numbers "+number1 +" ,"+number2 +" => "+multiply);
		
		int division = number1/number2;
		
		System.out.println("Division for your numbers "+number1 +" ,"+ number2 +" => "+division);
		
	}

} // end of class
