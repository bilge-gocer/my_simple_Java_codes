import java.util.ArrayList;
import java.util.Scanner;

public class MyBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        ArrayList<ArrayList> patients = new ArrayList<ArrayList>();

        do {
            System.out.println("Welcome to MyBMI!");
            System.out.println("1. Add Patient");
            System.out.println("2. Display All BMIs");
            System.out.println("3. Display Smallest BMI");
            System.out.println("4. Display Biggest BMI");
            System.out.println("5. Display Average BMI");
            System.out.println("6. Display Sorted BMI");
            System.out.println("0. Exit");

            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("What is your name?");
                String name = input.nextLine();
        
                System.out.println("Hello " + name);
        
                double height = 0;
                do {
                    System.out.println("What is your height (m)?");
                    height = input.nextDouble();
                    input.nextLine();
                } while (height < 0.3 || height > 3.0);

                double weight = 0;
                do {
                    System.out.println("What is your weight (kg)?");
                    weight = input.nextDouble();
                    input.nextLine();
                } while (weight < 10 || weight > 200);
                
                ArrayList patient = new ArrayList<>();

                double bmi = calculateBMI(weight, height);
                patient.add(bmi);

                String category = calculateCategory(bmi);
                patient.add(category);

                patients.add(patient);

                System.out.println("Your BMI category is " + category + " with a BMI of " + bmi);
                
            }
            else if (choice == 2) {
                System.out.println("Display All BMIs");

                for (int i = 0; i < patients.size(); i++) {
                    System.out.println("Category was " + patients.get(i).get(1) + " with a BMI of " + patients.get(i).get(0));
                }
            }
            else if (choice == 3) {
                double smallestBMI = (double) patients.get(0).get(0);

                for (int i = 1; i < patients.size(); i++) {
                    if ((double) patients.get(i).get(0) < smallestBMI) {
                        smallestBMI = (double) patients.get(i).get(0);
                    }
                }

                System.out.println("Smallest BMI is: " + smallestBMI);
            }
            else if (choice == 4) {
                double biggestBMI = (double) patients.get(0).get(0);

                for (int i = 1; i < patients.size(); i++) {
                    if ((double) patients.get(i).get(0) > biggestBMI) {
                        biggestBMI = (double) patients.get(i).get(0);
                    }
                }

                System.out.println("Biggest BMI is: " + biggestBMI);
            }
            else if (choice == 5) {
                double total = 0;

                for (int i = 1; i < patients.size(); i++) {
                    total = total + (double) patients.get(i).get(0);
                }

                double average = total / patients.size();

                System.out.println("Average BMI is: " + average);
            }
            else if (choice == 6) {
                ArrayList<ArrayList> unsorted = new ArrayList<ArrayList>();

                for (int i = 0; i < patients.size(); i++) {
                    unsorted.add(patients.get(i));
                }

                ArrayList<ArrayList> sorted = new ArrayList<ArrayList>();

                while (unsorted.size() > 0) {
                    double smallestBMI = (double) unsorted.get(0).get(0);
                    int smallestIndex = 0;

                    for (int i = 1; i < unsorted.size(); i++) {
                        if ((double) unsorted.get(i).get(0) < smallestBMI) {
                            smallestBMI = (double) unsorted.get(i).get(0);
                            smallestIndex = i;
                        }
                    }

                    sorted.add(unsorted.get(smallestIndex));
                    unsorted.remove(smallestIndex);
                }
                
                System.out.println("Sorted by BMI: " + sorted);
            }
        } while (choice != 0);
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String calculateCategory(double bmi) {
        if (bmi < 18) {
            return "Underweight";
        }
        else if (bmi < 25) {
            return "Normal";
        }
        else {
            return "Overweight";
        }
    }
}
