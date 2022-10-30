package zadanie4_1_1;

public class Square extends Shape{

    private final float a;

    Square() {
        this.a = 1;
    }
    Square(float a) {
        this.a = a;
    }

    @Override
    String getType() {
        return "Квадрат";
    }

    @Override
    float getArea() {
        return a * a;
    }

    @Override
    float getPerimeter() {
        return 4 * a;
    }
}
