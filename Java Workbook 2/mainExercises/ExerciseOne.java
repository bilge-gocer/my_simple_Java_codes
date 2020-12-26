package mainExercises;
import java.util.Scanner;
/* Request a score and output grade A, B, C or fail. A grade is 70 or above, B is 60 or above, C
is 50 or above and Fail is anything below */

public class ExerciseOne {

	Scanner sc = new Scanner(System.in);
	String name = "";
	int mark;
	
	public static void main(String[] args) {
		
		ExerciseOne score = new ExerciseOne();
		score.enterMarks();
		score.getGrade();
		
	}

	public void enterMarks()
	{
		
		System.out.println("Please enter your name:");
		name = sc.nextLine();
		System.out.println("Please enter your mark:");
		mark = sc.nextInt();
	}
	
	public void getGrade()
	{
		
		if (mark>=70)
			System.out.println("Well done "+name + "! You have passed A");
			else if (mark>=60)
				System.out.println("Well done "+name + "! You have passed B");
			else if (mark>50)
				System.out.println("Well done "+name + "! You have passed C");
		else
			System.out.println("You failed! Better luck next time.");
		
	}
	
}// end of class
