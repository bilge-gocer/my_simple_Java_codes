/** Write a Java program to do the following that determines your weight on another planet.
The program should ask for the user&#39;s weight on Earth, and then present a menu of the other
planets in our solar system. The user should choose one of the planets from the menu. The
program should display the phrase like the following: “Your weight on Mars is 55 lbs.” **/

package planet;
import java.util.Scanner;

public class Planet {
	
	Scanner plnt = new Scanner(System.in);
	int plntOne;
	Scanner lbs = new Scanner(System.in);
	double lbsOne;

	public static void main(String[] args) {
		
		Planet planetOne = new Planet();
		planetOne.userInput();
		planetOne.ifCon();
	}

	public void userInput()
	{
		System.out.println("Please enter a planet: \n"

		+ "1 for Mercury \n"
		+ "2 for Venice \n"
		+ "3 for Mars \n"
		+ "4 for Jupiter \n"
		+ "5 for Saturn \n"
		+ "6 for Uranus \n"
		+ "7 for Neptune \n");
		plntOne = plnt.nextInt();
		System.out.println("Please enter your weight on earth in lbs: ");
		lbsOne = lbs.nextDouble();
		
		
	}

	public void ifCon()
	{
		if (plntOne == 1)
		{
			System.out.println("Your weight on Mercury is " +(lbsOne * 0.38));
		
		}
		else if (plntOne == 2)
		{
			System.out.println("Your weight on Venice is " +(lbsOne * 0.91));
		}
		
		else if (plntOne == 3)
		{
			System.out.println("Your weight on Mars is " +(lbsOne * 0.38));
		}
			else if (plntOne == 4)
			{
				System.out.println("Your weight on Jupiter is " +(lbsOne * 2.36));
			}
			else if (plntOne == 5)
			{
				System.out.println("Your weight on Saturn is " +(lbsOne * 0.92));
			}
			else if (plntOne == 6)
			{
				System.out.println("Your weight on Uranus is " +(lbsOne * 0.89));
			}
		else if (plntOne == 7)
		{
			System.out.println("Your weight on Neptune is " +(lbsOne * 1.13));
		}
		else 
		{
			System.out.println("You did not select a valid planet.");
		}
		
	}
	
}// end of class


