/** In a certain class, there are 5 tests worth 100 points each. 
 * Write a program that will take in the 5 tests scores from the user,
 *  store the tests scores in an array, and then calculate the students' average.*/

package ePortfolioWeek2;
import java.util.Scanner;

public class PartThreeTwo {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int sum =0;
		
		int number[] = new int[5];
		System.out.println("Please enter your test scores.");
		
		for (int i =0; i<number.length ;i++)
		{
			number[i]=sc.nextInt();
			sum = sum + number[i];
		}
		
		System.out.println("Average :" + (sum/5));
		
	}

} // end of class
