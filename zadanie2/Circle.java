package zadanie2;
import java.math.*;

public class Circle {
    Point center;
    double r;

    public Circle(Point cent, double r)
    {
        this.center = cent;
        this.r = r;
    }
    public Circle()
    {
        center = new Point(0 ,0);
        r = 1;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double circleSquare()
    {
        double sq = Math.PI * Math.pow(r,2);
        return sq;
    }
    public double circleLength()
    {
        double lng = 2 * Math.PI * r;
        return lng;
    }
    public static void circleCompare(Circle c1, Circle c2)
    {
        if (c1.getR() > c2.getR())
        {
            System.out.println("Первая окружность больше второй");
        }
        else if (c1.getR() == c2.getR())
        {
            System.out.println("Окружности равны по размеру");
        }
        else System.out.println("Вторая окружность больше");
    }
}
