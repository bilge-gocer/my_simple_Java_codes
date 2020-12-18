package myName;

import java.util.Scanner;

public class NumberOfLetters {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String firstName = in.nextLine();
		System.out.println("Please enter your last name: ");
		String lastName=in.nextLine();
		
		String fullName = firstName+" "+lastName;
		
		System.out.println("Hello, my name is "+fullName+".");
		
		//calculate the number of letters in fullName variable
		
		int numberOfLetters =firstName.length() + lastName.length(); 
		
		System.out.println("There are "+numberOfLetters+" letters in my name.");

		in.close();
	}

	
}
