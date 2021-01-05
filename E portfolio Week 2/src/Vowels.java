/** Write a value-returning method, isVowel that returns the value true
 *  if a given character is a vowel, and otherwise returns false.
 *   In main() method accept a string from user and count number of vowels in that string.*/

package ePortfolioWeek2;

import java.util.Scanner;

public class Vowels {
   public static void main(String args[]){
	   Vowels m = new Vowels();
	   m.isVowel();
	  
   }
	   public void isVowel()
	   
	   {
	   
	   Scanner sc = new Scanner(System.in);
	   int count = 0;
	   String sentence ="";
	      System.out.println("Enter a sentence :"+sentence.toLowerCase());
	      sentence = sc.nextLine();
	      
	      for (int i=0 ; i<sentence.length(); i++){
	         char ch = sentence.charAt(i);
	         if(ch == 'a'|| ch == 'A'|| ch == 'e'|| ch == 'E'|| ch == 'i' ||ch == 'I' || ch == 'o' ||ch == 'O' || ch == 'u'||ch == 'U'){
	            count ++;
	         }
	      }
	      System.out.println("Number of vowels in the given sentence is "+count);
	      sc.close();
	   }
   
	   
} // end of class
	   
	


