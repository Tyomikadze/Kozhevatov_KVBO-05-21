package zadanie4_1_1;

public class TestShape {
    public static void main(String[] args) {
        Shape s = new Circle(2);
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());
        System.out.println(s.getType());
    }
}
