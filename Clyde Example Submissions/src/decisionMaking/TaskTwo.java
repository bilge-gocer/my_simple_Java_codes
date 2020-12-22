package decisionMaking;

   /* Write a program which determines a student’s grade based on their score.
      70 + is an A grade. Between 60 and 69 is a B. Between 50 and 59 is a C.
       Between 40 and 49 is a D and anything below 40 if a fail.
     */
 import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your test score: ");
		int score = in.nextInt();
		
		if(score>=70) 
		{
			System.out.println("Your Grade is => 'A' ");
		}
		else if(score>=60 && score <69)
		{
			System.out.println("Your Grade is => 'B' ");
		}
		else if(score>=50 && score <59)
		{
			System.out.println("Your Grade is => 'C' ");
		}
		else if(score>=40 && score <49)
		{
			System.out.println("Your Grade is => 'D' ");
		}
		else
		{
			System.out.println("Unfortunately, you failed to achieve a grade");
		}

	}

} // end of class
