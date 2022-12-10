package zadanie20;

import java.io.Serializable;
public class Parametric<T extends Comparable<T>, V extends Animal & Serializable, K>  {

    private T a;
    private V b;
    private K c;

    Parametric(T a, V b, K c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getT () {
        return a;
    }
    public V getV () {
        return b;
    }
    public K getK () {
        return c;
    }

    public void classNames() {
        System.out.println("Класс а: "+a.getClass().getSimpleName() + " Класс b: " + b.getClass().getSimpleName() + " Класс с: " + c.getClass().getSimpleName());
    }

}
