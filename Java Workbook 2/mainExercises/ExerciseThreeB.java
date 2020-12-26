package mainExercises;
/* Ask the user to enter two strings, if both strings are of equal length print “Match”
otherwise print “No match”. */

import java.util.Scanner;

public class ExerciseThreeB {

	public static void main(String[] args) {
		String stringOne = "";
		String stringTwo = "";
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word:");
		stringOne = sc.nextLine();
		System.out.println("Please enter other word:");
		stringTwo = sc.nextLine();
		sc.close();
		
		
		
		if (stringOne.equals(stringTwo))
		{
			System.out.println("Match!");
		}
		
		else
		{
			System.out.println("No Match!");
		}
	}

} // end of code

