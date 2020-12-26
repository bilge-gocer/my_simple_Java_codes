/* Takes in a value for atomic weight. Output hydrogen where the atomic weight is 0.08 and
0.1, Helium where the atomic weight is between 3.95 and 4.5, Carbon where atomic
weight is between 11.99 and 12.4 and Nitrogen where atomic weight is between 13.9 and 14.3 */

package mainExercises;
import java.util.Scanner;



public class ExerciseFiveB {

	Scanner atm = new Scanner(System.in);
	double atomic;
	
	public static void main(String[] args) {
		
		ExerciseFiveB temperature = new ExerciseFiveB();
		temperature.enterAtomic();
		temperature.getResult();
		
	}

	public void enterAtomic()
	{
		
	
		System.out.println("Please enter atomic weight:");
		atomic = atm.nextDouble();
	}
	
	public void getResult()
	{
		
		if (atomic >= 13.9 && atomic <= 14.3)
		{
			System.out.println("Nitrogen!");
		}
			else if (atomic >= 11.99 && atomic <= 12.4)
			{
				System.out.println("Carbon!");
			}
			else if (atomic >= 3.95 && atomic <= 4.5)
			{
				System.out.println("Helium!");
			}
			
		else if (atomic >= 0.08 && atomic <= 0.1)
		{
			System.out.println("Hydrogen");
		}
		
		else {
			System.out.println("This is not a selected element!");
		}
		
	}
	
}// end of class



		
		
		


