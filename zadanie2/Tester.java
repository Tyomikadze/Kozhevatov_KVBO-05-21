package zadanie2;
import java.lang.Math;

public class Tester {
    private Circle[] arr;
    private int dim;
    public Tester(int a)
    {
        dim = Math.abs(a);
        arr = new Circle[dim];
    }


    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = Math.abs(dim);
    }

    public Circle[] getArr() {
        return arr;
    }

    public void setArr(Circle[] arr) {
        this.arr = arr;
    }

}
