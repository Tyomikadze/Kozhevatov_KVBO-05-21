package zadanie4_1_1;

public class Rectangle extends Shape {

    private final float a;
    private final float b;

    Rectangle() {
        this.a = 1;
        this.b = 2;
    }
    Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }
    @Override
    String getType() {
        return "Прямоугольник";
    }

    @Override
    float getArea() {
        return a * b;
    }

    @Override
    float getPerimeter() {
        return 2 * (a + b);
    }
}
