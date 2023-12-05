*/WAP to accept a start and end point from the user and display the between No (10 89)*/

import java.util.Scanner;

public class NumbersBetweenRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start point: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end point: ");
        int end = scanner.nextInt();

        if (start > end) {
            System.out.println("Invalid input. Start point should be less than or equal to the end point.");
        } else {
            System.out.println("Numbers between " + start + " and " + end + ":");
            for (int i = start + 1; i < end; i++) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
