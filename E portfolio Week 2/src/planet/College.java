/** A professor in college will allow a student to be excused from the final exam if either of 
the
following is true:
• They have a 90% average or higher in the class and have missed 3 or less class
lectures.
• They have a 80% average or higher in the class and have not missed any class
lectures.
• The program below will determine whether a student can get out of the exam or not.
• Rewrite the program so only one if statement is used. **/

package planet;
import java.util.Scanner;

public class College {

	Scanner avr = new Scanner(System.in);
	int average;
	Scanner cls = new Scanner(System.in);
	int missedLect ;
	
	public static void main(String[] args) {
		College m = new College();
		m.userInput();
		m.ifCon();

	}
	public void userInput()
	{
	System.out.println("Please enter your average: ");
	average = avr.nextInt();
	System.out.println("Please enter the number of your missed lectures: ");
	missedLect = cls.nextInt();
	
}
	
	public void ifCon()
	{

	if (average>=90 && missedLect<=3)
		System.out.println("You are excuse from the final exam.");
	
	else if (average>=80 && missedLect == 0)
		System.out.println("You are excuse from the final exam.");
	else
		System.out.println("You must take the final exam.");
	}
}// end of class
