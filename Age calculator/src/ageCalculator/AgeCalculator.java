package ageCalculator;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		
		int year;
		
		
		Scanner cc =new Scanner(System.in);
		System.out.println("Please enter year of your birthday:");
	    year = cc.nextInt();
		System.out.println("Your age is : "+(2020-year) );
        cc.close();
	}

}
