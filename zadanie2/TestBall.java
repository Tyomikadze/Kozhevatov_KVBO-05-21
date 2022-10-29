package zadanie2;
import java.lang.*;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball(5, 7);
        System.out.println("X = " + b.getX() + ", Y = " + b.getY());
        Scanner source = new Scanner(System.in);
        double x, y;
        System.out.println("Введите Х:");
        x = source.nextDouble();
        b.setX(x);
        System.out.println("Введите Y:");
        y = source.nextDouble();
        b.setY(y);
        System.out.println("X = " + b.getX() + ", Y = " + b.getY());
        b.move(5, -6);
        System.out.println(b.toString());
    }
}
