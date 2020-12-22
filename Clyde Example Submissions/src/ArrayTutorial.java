import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTutorial {


    public static File fileName; //global objects for file and scanner
    public static Scanner input;

    public static String[][] Marks = new String[10][4]; // 2D array to store extracted data

    public static String[] firstNames = new String[10]; // 1D array to store extracted data
    public static String[] secondNames = new String[10];
    public static int[] halfTermMarks = new int[10];
    public static int[] fullTermMarks = new int[10];

    public static int[] totalGrades = new int[10];
    public static String[] award = new String[10]; // 1D array to store calculated values


    public static void main(String[] args) throws FileNotFoundException {


        //create file object to be read by scanner
        String nameOfFile = "src//studentMarks.txt";
        fileName = new File(nameOfFile);
        input = new Scanner(fileName);

        //use while loop to check for all the data that is to be read in
        while (input.hasNextLine()) {
            // use a nested for loop to add data to the 2D array until the end of file reached
            for (int i = 0; i < Marks.length; i++) {


                String[] line = input.nextLine().split(" ");
                for (int j = 0; j < line.length; j++) {
                    Marks[i][j] = line[j];
                }
                //print out to check that data has been read in and stored to 2D array

            }
        }
        System.out.println("Student Grades: " + "\n" + Arrays.deepToString(Marks));

        //use for loop to iterate my 2D array and extract data required for my 1D array
        for (int i = 0; i < fullTermMarks.length; i++) {
            fullTermMarks[i] = Integer.parseInt(Marks[i][3]);
            halfTermMarks[i] = Integer.parseInt(Marks[i][2]);
            secondNames[i] = Marks[i][1];
            firstNames[i] = Marks[i][0];
        }

        System.out.println("First Names: " + Arrays.toString(firstNames));
        System.out.println("Second Names: " + Arrays.toString(secondNames));
        System.out.println("Half Term Marks: " + Arrays.toString(halfTermMarks));
        System.out.println("Full Term Marks: " + Arrays.toString(fullTermMarks));

        calculateGrade();

    }

    public static void calculateGrade() {

        for (int i = 0; i < totalGrades.length; i++) {
            totalGrades[i] = halfTermMarks[i] + fullTermMarks[i];

            if (totalGrades[i] >= 80 && totalGrades[i] <= 100) {
                award[i] = "A";
                System.out.println("Well done " + firstNames[i] + " you got an 'A;");
            } else if (totalGrades[i] >= 70 && totalGrades[i] < 80) {
                award[i] = "B";
                System.out.println("Well done " + firstNames[i] + " you got an 'B;");
            } else if (totalGrades[i] >= 60 && totalGrades[i] < 70) {
                award[i] = "C";
                System.out.println("Well done " + firstNames[i] + " you got an 'C;");
            } else if (totalGrades[i] >= 50 && totalGrades[i] < 60) {
                award[i] = "D";
                System.out.println("Well done " + firstNames[i] + " you got an 'D;");
            } else {
                award[i] = "No Award";
                System.out.println("Unfortunately " + firstNames[i] + " you failed to achieve a grade");
            }
        }


        System.out.println(Arrays.toString(totalGrades));
        System.out.println(Arrays.toString(award));

        countOccurence(award); //method call with arguments

    }

    public static void countOccurence(String[] award) {


        int count = 0;
        for (int i = 0; i < award.length; i++) {
            if (award[i].equals("A")) {
                count++;
            }
        }

        System.out.println("There are " + count + " 'A' Passes in the class.");


    findHighestGrade();//call method
    findLowestGrade(); //call method

   }
    public static void findHighestGrade() {
    int highestMark = totalGrades[0];
    String student = " ";

    for (int i = 1; i < totalGrades.length; i++) {
        if (totalGrades[i] > highestMark) {
            highestMark = totalGrades[i];
            student = firstNames[i];
        }
    }
    System.out.println("Highest mark of: " + highestMark + " was achieved by " + student);
}
    public static void findLowestGrade () {
        int lowestMark = totalGrades[0]; //Set the first item to be the minimum
        String student = " ";

        for (int a = 1; a < totalGrades.length; a++) {
            if (totalGrades[a] < lowestMark) {
                lowestMark = totalGrades[a]; //set the current item to be the minimum
                student = firstNames[a];
            }
        }
        System.out.println("Lowest mark of: " + lowestMark + " was achieved by " + student);
    }

} //end of class
