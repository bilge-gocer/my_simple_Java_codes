/* Write code to output the level of damage in an earthquake. If the richter scale measures
between 7.5 and 8 damage is “Severe”. Between 6.5 and 7.4 damage is “serious”, between
5.5 and 6.4 damage is “moderate”, between 4.5 and 5.4 damage is “minimal” and below 4.5
damage is “unlikely to have occurred” */

package mainExercises;

import java.util.Scanner;

public class ExerciseFourA {

	Scanner abc = new Scanner(System.in);
	double damage;
	
	public static void main(String[] args) {
		
		ExerciseFourA damage = new ExerciseFourA();
		damage.enterMeasure();
		damage.getResult();
		
	}

	public void enterMeasure()
	{
		
	
		System.out.println("Please enter richter scale measure:");
		damage = abc.nextDouble();
	}
	
	public void getResult()
	{
		
		if (damage >= 7.5 && damage <= 8)
		{
			System.out.println("Severe!");
		}
			else if (damage >= 6.5 && damage <= 7.4)
			{
				System.out.println("Serious!");
			}
			else if (damage >= 5.5 && damage <= 6.4)
			{
				System.out.println("Moderate!");
			}
			else if (damage >= 4.5 && damage <= 5.4)
			{
				System.out.println("Minimal!");
			}
		else if (damage < 4.5)
		{
			System.out.println("Unlikely to have occurred.");
		}
		else 
		{
			System.out.println("This is not within range! ");
		}
		
	}
	
}// end of class
