package mainExercises;

import java.util.Scanner;
/* Request an amount and add a discount of 20% if a person a spent £100, 10% if they spent
£70 */

public class ExerciseTwo {
	
	Scanner sc = new Scanner(System.in);
	String name = "";
	double spent;

	public static void main(String[] args) {
		
		ExerciseTwo m = new ExerciseTwo();
		m.enterAmount();
		m.getSpent();
		
	}

	public void enterAmount()
	{
		
		System.out.println("Please enter your name");
		name = sc.nextLine();
		System.out.println("Please enter your spent");
		spent = sc.nextDouble();
	}
	
	public void getSpent()
	{
		
		if (spent>=100)
		{
			System.out.println("Conguratulations! You have won 20% discount.You will pay "+ (spent-(spent*20/100)) +"£");
		}
			else if (spent>=70)
			{
				System.out.println("Conguratulations! You have won 10% discount.You will pay "+(spent-(spent * 10/100))+"£");
			}
			
		else
		{
			System.out.println("You will pay "+spent+"£");
		}
		
	}
	
}// end of class


