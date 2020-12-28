
import java.util.ArrayList;
import java.util.Scanner;

public class MyShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();
        ArrayList<Integer> basket = new ArrayList<Integer>();

        int choice;

        do {
            System.out.println("***Welcome to MyShop***");
            System.out.println();
            System.out.println("1. Add Product");
            System.out.println("2. Search for Product");
            System.out.println("3. Display Total");
            System.out.println("0. Exit");
    
            System.out.println("Choice:");
            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("Please enter PIN:");
                String pin = input.nextLine();

                if (pin.equals("4321")) {
                    System.out.println("Product name:");
                    String name = input.nextLine();
                    names.add(name);

                    System.out.println("Product price:");
                    double price = input.nextDouble();
                    input.nextLine();
                    prices.add(price);
                }
                else {
                    System.out.println("Invalid PIN");
                }
            }
            else if (choice == 2) {
                System.out.println("Search name:");
                String searchName = input.nextLine();

                for (int i = 0; i < names.size(); i++) {
                    if (names.get(i).equals(searchName)) {
                        System.out.println("Match found and added to basket");
                        System.out.println(names.get(i) + ": " + prices.get(i));
                        basket.add(i);
                    }
                }
            }
            else if (choice == 3) {
                double total = 0.0;

                for (int i = 0; i < basket.size(); i++) {
                    int index = basket.get(i);
                    System.out.println(names.get(index));

                    total = total + prices.get(index);
                }

                System.out.println("Total: " + total);
            }
        } while (choice != 0);
    }
} // end of class

