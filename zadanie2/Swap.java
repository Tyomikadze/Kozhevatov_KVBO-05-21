package zadanie2;

public class Swap {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e", "f"};
        String tmp;
        for(int i = 0; i < arr.length / 2; i++)
        {
            tmp = arr[arr.length - i -1];
            arr[arr.length - i -1] = arr[i];
            arr[i] = tmp;
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
