import java.util.Scanner;

public class UserChoiceOperations {
    public static void findGreater() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double maxNumber = Math.max(num1, Math.max(num2, num3));
        System.out.println("The greater number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + maxNumber);
    }

    public static void checkEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static void checkVowel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (Character.isLetter(ch)) {
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is not a vowel.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid character.");
        }
    }

    public static void checkDivisibleBy5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5.");
        } else {
            System.out.println(number + " is not divisible by 5.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Find out greater between 3 numbers");
        System.out.println("2. Check if a given number is even or odd");
        System.out.println("3. Check if a given character is a vowel");
        System.out.println("4. Check if a given number is divisible by 5");

        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                findGreater();
                break;
            case 2:
                checkEvenOdd();
                break;
            case 3:
                checkVowel();
                break;
            case 4:
                checkDivisibleBy5();
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }
}
