
package ePortfolioWeek2;

public class PartFourTwo {

	public static void main(String[] args) {
		
		// This program will calculate for average
		
		int [] storSpace = {232,241,324,216,221,298,334,212,235,324,264,141};

		int sum;
		
		sum = storSpace[0];
		for (int i=0; i<storSpace.length; i++)
		{
		sum = sum + storSpace[i];
		
		}
		System.out.println(sum/storSpace.length);
		
		
	}

} // end of class
