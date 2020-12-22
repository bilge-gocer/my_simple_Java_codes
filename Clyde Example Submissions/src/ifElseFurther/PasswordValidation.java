package ifElseFurther;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		
		String password = "1234";
		int fail = 3;
		
		
		System.out.println("Welcome to Clyde Bank");
            	
            	do {    
            		    
            		System.out.println("Please enter your PIN to continue: ");    
            		String login = in.nextLine(); 
            		if (login.equals(password)) {        
            			System.out.println("Your PIN is correct!"); 
            			System.exit(0);
            			}    
            		else 
            		{        
            			fail--;        
            			System.out.println("Your PIN is incorrect"); //print message to user 
            			       
            			System.out.println("You have: " + fail + " attempts left.");   
            			}
            		}while(fail!=0);
            	System.out.println("Number of attempts exceeded. Your bank card is blocked.");
            	System.exit(0);
	}

} // end of class
