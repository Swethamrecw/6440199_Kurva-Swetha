import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num0 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num1 = sc.nextInt();

        try {
            int result = num0 / num1;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        sc.close();
    }
}
