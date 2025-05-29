import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n1 = scanner.nextInt();

        System.out.println("Multiplication table for " + n1 + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n1 + " x " + i + " = " + (n1 * i));
        }

        scanner.close();
    }
}
