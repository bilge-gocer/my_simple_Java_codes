/** A series of files have been sent to your program with different memory sizes.
 *  The sizes are all in whole numbers of Megabytes (MB).
 *   You have been asked to create a program that will find the file with the largest memory size. 
*/

package ePortfolioWeek2;

public class PartFourOne {

	public static void main(String[] args) {
		

		int [] storSpace = {232,241,324,216,221,298,334,212,235,324,264,141};
		int largest;
		
		largest = storSpace[0];
		for (int i = 0 ; i < storSpace.length ; i++)
		{
			if (largest < storSpace[i])
			{
				largest = storSpace[i];
			}
		}
		System.out.println(largest);
		
		
	}

} // end of class
