public class MethodOverloading {
    
    // Method to add two integers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to add two doubles
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to add three integers
    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 integers: " + add(5, 10));
        System.out.println("Sum of 2 doubles: " + add(5.5, 4.5));
        System.out.println("Sum of 3 integers: " + add(1, 2, 3));
    }
}
