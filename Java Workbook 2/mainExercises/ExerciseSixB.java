package mainExercises;

public class ExerciseSixB {

	public static void main(String[] args) {
		
		
		String typeOfDay ="Wednesday";
	     switch (typeOfDay) {
	         case "Monday":
	             System.out.println("Start of work week");
	             break;
	         case "Tuesday":
	         case "Wednesday":
	         case "Thursday":
	        	 System.out.println("Midweek");
	             break;
	         case "Friday":
	        	 System.out.println("End of work week");
	             break;
	         case "Saturday":
	         case "Sunday":
	        	 System.out.println("Weekend");
	             break;
	         default:
	        	 System.out.println("Unknown");
	}

}
} // end of class
