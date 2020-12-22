package decisionMaking;
/* Write a program which determines if a number is odd or even and output the result to the user. */

import java.util.Scanner;

public class TaskThree {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = in.nextInt();
		
		if (number % 2 == 0)
		{
			System.out.println("Your number is even!");
		}
			
		else
		{
			System.out.println("Your number is odd!");
		}
		
	}

}
