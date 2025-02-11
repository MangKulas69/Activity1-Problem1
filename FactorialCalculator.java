/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialcalculator;

import java.util.Scanner;

/**
 *
 * @author ALIPAN_CpE121
 */
public class FactorialCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Calculate and display the factorial
            System.out.println("The factorial of " + number + " is " + calculateFactorial(number));
        }

        // Close the scanner
        scanner.close();
    }
   public static long calculateFactorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }

        long result = 1;
        int i = 1;

        // Using while loop to calculate factorial
        while (i <= n) {
            result *= i;
            i++; // Increment the counter
        }

        return result;
    }
}
