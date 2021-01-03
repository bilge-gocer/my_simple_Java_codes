package doWhile;

// calculate average
import java.util.Scanner;
public class DoWhileTwo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter values, Q to quit");

		double total = 0;
		int count = 0;
		while (in.hasNextDouble())
		{
			double input = in.nextDouble();
			total = total + input;
			count++;
		}		
		double average = 0;
		if (count > 0)
		{
			average = total / count;
		}
		
		System.out.println("Average: "+average);
		
	}

}// end of class
