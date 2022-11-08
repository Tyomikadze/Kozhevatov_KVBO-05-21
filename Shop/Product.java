package Shop;

public class Product {
    private String name;
    private int price;
    private Catalog nameCtg;

    Product(String name, int price, Catalog ctg) {
        this.name = name;
        this.price = price;
        this.nameCtg = ctg;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public Catalog getNameCtg() {
        return nameCtg;
    }
}
