package zadanie20;

public class MinMax<E extends Comparable> {
    private E[] arr;

    MinMax(E[] arr) {
        this.arr = arr;
    }
    public E min() {
        E tmp = null;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i+1]) < 0) {
                tmp = arr[i];
            } else if (arr[i].compareTo(arr[i+1]) > 0) {
                tmp = arr[i+1];
            }
            else tmp = arr[i];
        }
        return tmp;
    }

    public E max() {
        E tmp = null;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i+1]) < 0) {
                tmp = arr[i+1];
            } else if (arr[i].compareTo(arr[i+1]) > 0) {
                tmp = arr[i];
            }
            else tmp = arr[i];
        }
        return tmp;
    }

}
