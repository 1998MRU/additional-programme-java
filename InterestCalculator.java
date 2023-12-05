*/Write a program to accept age and gender from the user and check the ROI according to condition*/

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your gender (M/F): ");
        char gender = scanner.next().charAt(0);

        double baseInterestRate = 0.05; // Default base interest rate

        // Check conditions based on age and gender
        if (age < 18) {
            System.out.println("Sorry, you are not eligible for a loan.");
        } else {
            if (age >= 18 && age <= 30) {
                if (gender == 'M') {
                    baseInterestRate += 0.02; // Additional 2% for males aged 18-30
                } else if (gender == 'F') {
                    baseInterestRate -= 0.01; // Decrease 1% for females aged 18-30
                }
            } else if (age > 30 && age <= 60) {
                if (gender == 'M') {
                    baseInterestRate += 0.01; // Additional 1% for males aged 31-60
                }
                // No special conditions for females in the age group 31-60
            } else {
                System.out.println("Sorry, you are not eligible for a loan.");
                return; // Exit the program if age is greater than 60
            }

            // Display the calculated interest rate
            System.out.println("Your interest rate is: " + (baseInterestRate * 100) + "%");
        }

        scanner.close();
    }
}
