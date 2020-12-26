	/* Set user name and password variables, request input from the user if the user name and
password match then print “access permitted” otherwise print access denied. */

package mainExercises;

import java.util.Scanner;

public class ExerciseThreeA {

	public static void main(String[] args) {
		
		String userName = "";
		String password = "";
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please create your user name:");
		userName = sc.nextLine();
		System.out.println("Please create your password:");
		password = sc.nextLine();
		System.out.println("Your user name is :"+"neww"+userName);
		System.out.println("Your password is :"+"neww"+ password);
		
		
		String newUserNameOne = "neww";
		String newUserNameTwo = userName;
		String fullUserName = newUserNameOne+newUserNameTwo;
		String newPasswordOne = "neww";
		String newPasswordTwo = password;
		String fullPassword = newPasswordOne+newPasswordTwo;
		
		System.out.println("Please enter your user name:");
		fullUserName = sc.nextLine();
		System.out.println("Please enter your password:");
		fullPassword = sc.nextLine();
		sc.close();
		
		
		
		if (fullUserName.equals("neww"+userName))
		{
			if (fullPassword.equals("neww"+password)) {
			System.out.println("Access permitted!");
			}
			else {
				System.out.println("Access denied!");
			}
		}
		
		else
		{
			System.out.println("Access denied!");
		}
	}

} // end of code
