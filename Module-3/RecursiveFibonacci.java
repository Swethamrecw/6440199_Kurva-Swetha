import java.util.Scanner;

public class RecursiveFibonacci {

    public static int fibonacci(int num) {
        if (num <= 1) return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Invalid input. Enter a non-negative integer.");
        } else {
            int result = fibonacci(num);
            System.out.println("Fibonacci number at position " + num + " is: " + result);
        }
        sc.close();
    }
}
