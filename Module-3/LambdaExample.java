import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExamples {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");

        // Sort with lambda expression
        Collections.sort(fruits, (a1, b1) -> a.compareToIgnoreCase(b1));

        System.out.println("Sorted list:");
        fruits.forEach(System.out::println);
    }
}
