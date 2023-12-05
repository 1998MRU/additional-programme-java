import java.util.Scanner;

public class OperatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operator category:");
        System.out.println("1. Arithmetic Operator");
        System.out.println("2. Logical Operator");
        System.out.println("3. Relational Operator");
        System.out.println("4. Bitwise Operator");
        System.out.println("5. Conditional Operator");
        System.out.println("6. Assignment Operator");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                performArithmeticOperations();
                break;
            case 2:
                performLogicalOperations();
                break;
            case 3:
                performRelationalOperations();
                break;
            case 4:
                performBitwiseOperations();
                break;
            case 5:
                performConditionalOperation();
                break;
            case 6:
                performAssignmentOperation();
                break;
            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 6.");
        }

        scanner.close();
    }

    private static void performArithmeticOperations() {
        // Implement arithmetic operations here
        System.out.println("Arithmetic operations selected.");
        // Add your arithmetic operations logic here
    }

    private static void performLogicalOperations() {
        // Implement logical operations here
        System.out.println("Logical operations selected.");
        // Add your logical operations logic here
    }

    private static void performRelationalOperations() {
        // Implement relational operations here
        System.out.println("Relational operations selected.");
        // Add your relational operations logic here
    }

    private static void performBitwiseOperations() {
        // Implement bitwise operations here
        System.out.println("Bitwise operations selected.");
        // Add your bitwise operations logic here
    }

    private static void performConditionalOperation() {
        // Implement conditional operation here
        System.out.println("Conditional operation selected.");
        // Add your conditional operation logic here
    }

    private static void performAssignmentOperation() {
        // Implement assignment operation here
        System.out.println("Assignment operation selected.");
        // Add your assignment operation logic here
    }
}
