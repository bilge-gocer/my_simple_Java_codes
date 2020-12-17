/** Write a program that prompts the user to enter two floating point (double) numbers and an
operator ( *, +, /, %, -). Display the results of the given operation. For reading the command
line, use the Scanner class. Write the program  using if/else logic. **/

package mathOp;

import java.util.Scanner;

public class MathOp {
	
	double numberOne;
	double numberTwo;
	Scanner number = new Scanner(System.in);
	String operator = "+";
	Scanner operators = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		MathOp m = new MathOp();
		m.userInput();
		m.ifElse();
			
	}

	public void userInput()
	{
		System.out.println("Please enter a number:");
		numberOne = number.nextDouble();
		System.out.println("Please enter other number:");
		numberTwo = number.nextDouble();
		System.out.println("Please choose an opearator:  *   +    /    %   -  ");
		operator = operators.nextLine();
		
	}
	
	public void ifElse()
	// I will use if/else logic.
	
	{
		if (operator.equals("+")) 
			System.out.println("Result is :"+ (numberOne + numberTwo));
		
		else if (operator.equals("-"))
	        System.out.println("Result is :" + (numberOne - numberTwo));
		
		else if (operator.equals("*"))
	        System.out.println("Result is :" + (numberOne * numberTwo));
		
		else if (operator.equals("/"))
	        System.out.println("Result is :" + (numberOne / numberTwo));
		
		else if (operator.equals("%"))
	        System.out.println("Result is :" + (numberOne % numberTwo));
		
		
	}
	}// end of class
