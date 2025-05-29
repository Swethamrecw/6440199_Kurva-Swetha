import java.util.Scanner;

public class SimpleCalculatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double n1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double n2 = scanner.nextDouble();

        System.out.println("Choose operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        double result;

        switch (operation) {
            case '+':
                result = n1 + n2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = n1 - n2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = n1 * n2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (n2 != 0) {
                    result = n1 / n2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }

        scanner.close();
    }
}
