package forWorksheet;
import java.util.Scanner;
/**
 * This program prints the average of salary 
 * values that are with a sentinel*/
	public class ForWorkSheetThree
	{
		public static void main(String[] args) 
		{
			boolean done = false;
			double sum = 0;
			int count = 0;
			double salary =0;
			System.out.println("Enter salaries, -1 to finish: ");
			Scanner in = new Scanner(System.in);
		
		
			while (!done)
			{
				salary = in.nextDouble();
				if (salary == -1)
			{
				done = true;
				break;
			}
				
					sum = sum + salary;
					count++;
			}
				
			if (count>0)
			{
				double average = sum/count;
				System.out.println("Average salary: " + average);
			}
			else
			{
				System.out.println("No data");
			}
		
		}
}
