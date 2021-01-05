
// Decoder program
package ePortfolioWeek2;

import java.util.Scanner;

public class PartThreeOne {
	
	
	

	public static void main(String[] args) {
		
		int number;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter numbers: ");
		number = sc.nextInt();
		
		for (int i =1; i<11 ; i++)
		{
			 switch (number)
			  {
			  case 1:				  
			  System.out.println("D");
			  break;
			  case 2:				  
			  System.out.println("W");
			  break;
			  case 3:				  
			  System.out.println("E");
			  break;
			  case 4:				  
			  System.out.println("L");
			  break;
			  case 5:				  
			  System.out.println("H");
			  break;
			  case 6:				 
			  System.out.println("O");
			  break;
			  case 7:				  
			  System.out.println("R");
			  break;
			  
			  } 
			 number = sc.nextInt();
		}

		
	}
		
} // end of class
