package zadanie7.n2_3;

public class MovablePoint implements Movable {
    private int x;
    private int y;


    MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    MovablePoint() {
        this.x = 0;
        this.y = 0;
    }


    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }


    @Override
    public void moveUp(int a) {
        y-=a;
    }

    @Override
    public void moveDown(int a) {
        y+=a;
    }

    @Override
    public void moveLeft(int a) {
        x-=a;
    }

    @Override
    public void moveRight(int a) {
        x+=a;
    }


    @Override
    public String toString() {
        return Integer.toString(x) + " " + Integer.toString(y);
    }
}
