package zadanie2;

public class CircleTester {
    public static void main(String[] args) {

        Circle c1 = new Circle(new Point(3,6), 6);
        Circle c2 = new Circle();
        System.out.println("c1 length = " + c1.circleLength() + "\nc1 square = " + c1.circleSquare());
        System.out.println("c2 length = " + c2.circleLength() + "\nc2 square = " + c2.circleSquare());
        Circle.circleCompare(c1, c2);

    }
}
