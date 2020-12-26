/* Request a cost of a job, if the job cost more £200 the no call charge is added. Otherwise
the call charge is £80 */

package mainExercises;

import java.util.Scanner;

public class ExerciseTwoB {

	Scanner sc = new Scanner(System.in);
	String name = "";
	int cost;
	
	public static void main(String[] args) {
		
		ExerciseTwoB m = new ExerciseTwoB();
		m.enterAmount();
		m.getCost();
		
	}

	public void enterAmount()
	{
		
		System.out.println("Please enter your name");
		name = sc.nextLine();
		System.out.println("Please enter your cost");
		cost = sc.nextInt();
	}
	
	public void getCost()
	{
		
		if (cost>=200)
		{
			System.out.println("Thank you "+name+" .You have no call charge.You will pay "+cost +"£");
		}
			
		else
		{
			System.out.println("Thank you "+name+" .You will pay "+(cost+80)+"£");
		}	
		
	}
	
}// end of class

