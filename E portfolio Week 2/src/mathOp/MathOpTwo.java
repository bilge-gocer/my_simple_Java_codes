/** Write a program that prompts the user to enter two floating point (double) numbers and an
operator ( *, +, /, %, -). Display the results of the given operation. For reading the command
line, use the Scanner class. Write the program using switch logic. **/

package mathOp;
import java.util.Scanner;

public class MathOpTwo {
	
	double numberOne;
	double numberTwo;
	Scanner number = new Scanner(System.in);
	String operator = "";
	Scanner operators = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		MathOpTwo m = new MathOpTwo();
		m.userInput();
		m.switchCase();
			
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
	
	public void switchCase()
	// I will use switch logic.
	
	{
		switch (operator)
		{
			case "+":
				System.out.println("Result is :"+ (numberOne + numberTwo));
			break;
			case "-":
				System.out.println("Result is :" + (numberOne - numberTwo));
			break;
			case "*":
				 System.out.println("Result is :" + (numberOne * numberTwo));
				 break;
			case "/":
				System.out.println("Result is :" + (numberOne / numberTwo));
				break;
			case "%":
				System.out.println("Result is :" + (numberOne % numberTwo));
				break;
		}	
		
	}
	}// end of class

	


