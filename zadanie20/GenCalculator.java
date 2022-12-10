package zadanie20;

public class GenCalculator {
    public static <A extends Number, B extends Number> double sum (A a, B b) {
        return (a.doubleValue() + b.doubleValue());
    }
    public static <A extends Number, B extends Number> double divide (A a, B b) {
        return (a.doubleValue() / b.doubleValue());
    }
    public static <A extends Number, B extends Number> double multiple(A a, B b) {
        return (a.doubleValue() * b.doubleValue());
    }
    public static <A extends Number, B extends Number> double subtraction (A a, B b) {
        return (a.doubleValue() - b.doubleValue());
    }
}
