/* Takes in a value for temperature. Output based on the temperature whether an element
is solid, liquid or gas. Below 0 the element will be solid, between o and 100 the element
will be liquid, above 100 the element will be gas. */

package mainExercises;

import java.util.Scanner;

public class ExerciseFiveA {

	Scanner temp = new Scanner(System.in);
	int temperature;
	
	public static void main(String[] args) {
		
		ExerciseFiveA temperature = new ExerciseFiveA();
		temperature.enterMeasure();
		temperature.getResult();
		
	}

	public void enterMeasure()
	{
		
	
		System.out.println("Please enter tempereture:");
		temperature = temp.nextInt();
	}
	
	public void getResult()
	{
		
		if (temperature >= 100)
		{
			System.out.println("Gas");
		}
			else if (temperature > 0 && temperature < 100)
			{
				System.out.println("Liquid");
			}
		
		else if (temperature < 0)
		{
			System.out.println("Solid");
		}
		
		
	}
	
}// end of class

