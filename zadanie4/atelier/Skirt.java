package zadanie4.atelier;

public class Skirt extends Clothes implements WomenClothing {
    private final String name = "юбка";
    public Skirt(Size size, String color, int price) {
        super(size, color, price);
        super.name = "юбка";
    }

    public String getName() {
        return name;
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина одела юбку размера " + super.getSize() + ", Цвета: " + super.getColor() + ", Стоимостью: " + super.getPrice());
    }
}
