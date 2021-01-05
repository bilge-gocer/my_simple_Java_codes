package ePortfolioWeek2;

public class PartFourTwoC {

	public static void main(String[] args) {
		// This program will calculate the total memory used

		
		int [] storSpace = {232,241,324,216,221,298,334,212,235,324,264,141};
		int sum =0;
		
		for (int i = 0; i < storSpace.length; i++)
		{
			sum = sum + storSpace[i];
		}
		System.out.println(sum);
	}

} // end of class
