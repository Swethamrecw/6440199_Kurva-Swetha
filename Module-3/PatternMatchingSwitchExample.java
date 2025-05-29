public class PatternMatchingSwitchExample {
    public static void checkType(Object obj) {
        String results = switch (obj) {
            case Integer i -> "Integer with val " + i;
            case String s -> "String with val '" + s + "'";
            case Double d -> "Double with val " + d;
            case null -> "Object is null";
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };
        System.out.println(results);
    }

    public static void main(String[] args) {
        checkType(123);
        checkType("Hello");
        checkType(45.67);
        checkType(true);
        checkType(null);
    }
}
