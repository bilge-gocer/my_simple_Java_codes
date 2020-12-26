/* Request a value and check if it is odd or even. */

package mainExercises;

import java.util.Scanner;

public class ExerciseTwoC {

	Scanner sc = new Scanner(System.in);
	int number = 0;
	
	public static void main(String[] args) {
		
		ExerciseTwoC m = new ExerciseTwoC();
		m.enter();
		m.getNumber();
		
	}

	public void enter()
	{
		

		System.out.println("Please enter a number");
		number = sc.nextInt();
	}
	
	public void getNumber()
	{
		
		if (number % 2 == 0)
		{
			System.out.println("Your number is even!");
		}
			
		else
		{
			System.out.println("Your number is odd!");
		}
		
		
	}
	
}// end of class

