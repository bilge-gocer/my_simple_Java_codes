/** Write a method named isEven that accepts an integer argument. 
 * The method should return true if the argument is even, or false otherwise. 
 * Also write a program to test your method.
*/

package ePortfolioWeek2;
import java.util.Scanner;

public class EvenOdd {
	int number;
	Scanner in = new Scanner(System.in);
	boolean even;
	

	public static void main(String[] args) {
		

		EvenOdd m = new EvenOdd();
		m.isEven();
		
	}

	public void isEven()
	
	{
		System.out.println("Please enter a number: ");
		number = in.nextInt();
		
		
			if (number %2 == 0)
			{
				even = true;
				System.out.println(even);
			}
			
			else
				
			{
				System.out.println(even=false);
			}
			
	} //  end of method
	
}// end of class
