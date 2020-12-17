package primeNum;
import java.util.Scanner;

public class PrimeNum {
	
	Scanner primeNum = new Scanner(System.in);
	int num;
    boolean prime = false;
    
	public static void main(String[] args) {
		 
	      PrimeNum m = new PrimeNum();
	      m.inputSystem();
	      m.ifElse();
	       
	}
	       public void inputSystem()
	       {
	    	   System.out.println("Enter a number:");
	    	   num = primeNum.nextInt();
	    	   
	       }
	      
	       public void ifElse()
	       {
	
	    	  for(int i = 2; i <= num/2; ++i)
	       {
	           // condition for non-prime number
	           if(num % i == 0)
	           {
	               prime = true;
	               break;
	           }
	       }

	       if (!prime)
	           System.out.println("True ! " + num + " is a prime number.");
	       else
	           System.out.println("False ! "+ num + " is not a prime number.");
	       }

	
	

}// end of class
