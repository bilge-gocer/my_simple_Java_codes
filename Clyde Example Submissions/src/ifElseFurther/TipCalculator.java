package ifElseFurther;

import java.util.Scanner;
public class TipCalculator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Thank you for coming over to our restaurant! ");
		
		System.out.println("Please enter your bill : ");
		double bill = in.nextInt();
		
		System.out.println("Please rate your satisfaction level : ");
		System.out.println(" 1 = Totally satisfied ");
		System.out.println(" 2 = Satisfied ");
		System.out.println(" 3 = Dissatisfied ");
		int rate = in.nextInt();
		
		//double tip =0.0;
		
		if(rate ==1) 
		{
			System.out.println("Your tip is : "+(bill * 0.2)+"$");
		}
		else if(rate ==2)
		{
			System.out.println("Your tip is : "+(bill * 0.15)+"$");
		}
		else
		{
			System.out.println("Your tip is : "+(bill * 0.1)+"$");
		}
		

	}

}
