*/Create a program
1)about yourself
2)Arith
3)ass
4)logical
5)compar*/


import java.util.Scanner;

public class MyJavaProgram {

    public static void main(String[] args) {
        // Section 1: About Yourself
        System.out.println("About Myself:");
        System.out.println("I am ChatGPT, a language model created by OpenAI.");

        // Section 2: Arithmetic Operations
        System.out.println("\nArithmetic Operations:");
        performArithmeticOperations();

        // Section 3: Assignment Operations
        System.out.println("\nAssignment Operations:");
        performAssignmentOperations();

        // Section 4: Logical Operations
        System.out.println("\nLogical Operations:");
        performLogicalOperations();

        // Section 5: Comparison Operations
        System.out.println("\nComparison Operations:");
        performComparisonOperations();
    }

    // Method for Section 2: Arithmetic Operations
    private static void performArithmeticOperations() {
        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));
    }

    // Method for Section 3: Assignment Operations
    private static void performAssignmentOperations() {
        int a = 5;

        System.out.println("Initial value of a: " + a);
        a += 3;
        System.out.println("After += 3: " + a);
        a -= 2;
        System.out.println("After -= 2: " + a);
        a *= 4;
        System.out.println("After *= 4: " + a);
        a /= 2;
        System.out.println("After /= 2: " + a);
        a %= 3;
        System.out.println("After %= 3: " + a);
    }

    // Method for Section 4: Logical Operations
    private static void performLogicalOperations() {
        boolean isJavaFun = true;
        boolean isChatGPTAwesome = true;

        System.out.println("Logical AND: " + (isJavaFun && isChatGPTAwesome));
        System.out.println("Logical OR: " + (isJavaFun || isChatGPTAwesome));
        System.out.println("Logical NOT for isJavaFun: " + (!isJavaFun));
    }

    // Method for Section 5: Comparison Operations
    private static void performComparisonOperations() {
        int x = 10;
        int y = 5;

        System.out.println("Is x equal to y? " + (x == y));
        System.out.println("Is x not equal to y? " + (x != y));
        System.out.println("Is x greater than y? " + (x > y));
        System.out.println("Is x less than or equal to y? " + (x <= y));
    }
}
