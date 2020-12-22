package decisionMaking;

/* Write a program which determines if a student has passed or failed a test based on the entering a score. The pass mark is 60. */

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your test score: ");
		int score = in.nextInt();
		
		if(score>=60) 
		{
			System.out.println("Congratulations! You passed the test :) ");
		}
		else
		{
			System.out.println("Unfortunately, you failed the test :( ");
		}
	}

} // end of class
