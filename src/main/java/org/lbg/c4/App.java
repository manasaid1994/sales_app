package org.lbg.c4;


import java.util.Scanner;

public class App {

    public static double calculateTotalCost(double[] prices, double vatRate) {
        double totalCost = 0;
        for (double price : prices) {
            double vatAmount = price * vatRate / 100;  // Calculate VAT for each item
            totalCost += price + vatAmount;            // Add price + VAT to the total cost
        }
        return totalCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {
            System.out.print("Press Enter to continue or type QUIT to exit: ");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("QUIT")) {
                System.out.println("Exiting the program...");
                break;
            }

            System.out.print("Enter the VAT rate (%): ");
            double vatRate = scanner.nextDouble();

            System.out.println("Enter the item prices (type 0 to stop):");
            double price;
            double[] prices = new double[100];
            int count = 0;

            while (true) {
                System.out.print("Enter item price: ");
                price = scanner.nextDouble();

                if (price == 0) {
                    break;
                }

                prices[count] = price;
                count++;
            }

            double totalCost = calculateTotalCost(prices, vatRate);

            System.out.println("Total cost including VAT: £" + (float)totalCost);

            scanner.nextLine();

            System.out.print("Type QUIT to exit or press Enter to perform another calculation: ");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("QUIT")) {
                System.out.println("Exiting the program...");
                break;
            }
        }

        scanner.close();
    }
}
