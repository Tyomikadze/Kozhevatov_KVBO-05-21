package zadanie4.atelier;

public abstract class Clothes {
    private final Size size;
    private final int price;
    private final String color;
    protected String name;

    public Clothes(Size size, String color, int price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
