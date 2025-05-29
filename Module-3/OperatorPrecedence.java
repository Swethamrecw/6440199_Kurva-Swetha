public class OperatorPrecedence {
    public static void main(String[] args) {
        int result0 = 10 + 5 * 2;
        int result1 = (10 + 5) * 2;
        int result2 = 20 / 5 + 3 * 2;

        System.out.println("Result0 (10 + 5 * 2): " + result0);
        System.out.println("Result1 ((10 + 5) * 2): " + result1);
        System.out.println("Result2 (20 / 5 + 3 * 2): " + result2);
    }
}
