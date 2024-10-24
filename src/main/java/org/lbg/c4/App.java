package org.lbg.c4;


import java.util.Scanner;
public class App {

    public static double calculateVAT(double cost, double vatRate) {
        return cost * vatRate / 100;  // Returns the VAT amount
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input

        System.out.print("Enter the cost of the item: ");
        double cost = scanner.nextDouble();
git 
        System.out.print("Enter the VAT rate (%): ");
        double vatRate = scanner.nextDouble();

        double vatAmount = calculateVAT(cost, vatRate);

        double totalPrice = cost + vatAmount;

        System.out.println("VAT amount: " + vatAmount);
        System.out.println("Total price including VAT: " + totalPrice);

        scanner.close();
    }

}
