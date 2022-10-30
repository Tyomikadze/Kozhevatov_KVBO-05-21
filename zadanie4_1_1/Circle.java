package zadanie4_1_1;

public class Circle extends Shape{
    private final float r;

    Circle() {
        this.r = 1;
    }
    Circle(float r) {
        this.r = r;
    }

    @Override
    float getArea() {
        return (float) (Math.PI * r * r);
    }

    @Override
    String getType() {
        return "Круг";
    }

    @Override
    float getPerimeter() {
        return (float) (2 * Math.PI * r);
    }
}
