package Shop;

import java.util.ArrayList;

public class Bin {
    static ArrayList<Product> prodList = new ArrayList<Product>();

    public static void addProduct(Product p) {
        prodList.add(p);
    }
    public static int getCheck() {
        int sum = 0;
        for(Product p : prodList) {
           sum += p.getPrice();
        }
        return sum;
    }
}
