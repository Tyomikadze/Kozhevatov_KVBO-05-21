package zadanie7.n2_3;

public class MovableRectangle implements Movable {
    private MovablePoint topleft;
    private MovablePoint downright;


    MovableRectangle(MovablePoint a, MovablePoint b) {
        if ((a.getX() >= b.getY()) || (a.getX() >= b.getX())) {
            System.out.println("что-то не так, создаю единичный квадрат с левой-верхней точкой в (0,0)");
            this.topleft = new MovablePoint();
            this.downright = new MovablePoint(1,1);
        }
        else {
            this.topleft = a;
            this.downright = b;
        }
    }
    MovableRectangle() {
        this.topleft = new MovablePoint();
        this.downright = new MovablePoint(1,1);
    }


    public MovablePoint getTopleft() {
        return topleft;
    }

    public MovablePoint getDownright() {
        return downright;
    }

    public void speedTest() {
        MovableRectangle testRect = new MovableRectangle(this.topleft, this.downright);
        double diag = Math.sqrt(Math.pow((testRect.downright.getX() - testRect.topleft.getX()),2) + Math.pow((testRect.downright.getY() - testRect.topleft.getY()),2));
        testRect.moveLeft((int) Math.round(Math.random()));
        testRect.moveDown((int) Math.round(Math.random()));
        testRect.moveRight((int) Math.round(Math.random()));
        testRect.moveUp((int) Math.round(Math.random()));
        double newdiag = Math.sqrt(Math.pow((testRect.downright.getX() - testRect.topleft.getX()),2) + Math.pow((testRect.downright.getY() - testRect.topleft.getY()),2));
        if (diag == newdiag) {
            System.out.println("Скорость точек одинакова");
        }
        else {
            System.out.println("Что-то не так, скорость различна");
        }

    }

    @Override
    public void moveUp(int a) {
        this.topleft.moveUp(a);
        this.downright.moveUp(a);
    }

    @Override
    public void moveDown(int a) {
        this.topleft.moveDown(a);
        this.downright.moveDown(a);
    }

    @Override
    public void moveLeft(int a) {
        this.topleft.moveLeft(a);
        this.downright.moveLeft(a);
    }

    @Override
    public void moveRight(int a) {
        this.topleft.moveRight(a);
        this.downright.moveRight(a);
    }

    @Override
    public String toString() {
        return topleft.toString() + "   " + downright.toString();
    }

    public static void main(String[] args) {
        MovableRectangle myRect = new MovableRectangle(new MovablePoint(1, 2), new MovablePoint(3, 4));
        System.out.println(myRect.toString());
        myRect.moveRight(3);
        myRect.moveDown(2);
        System.out.println(myRect.toString());
        myRect.speedTest();
    }
}
