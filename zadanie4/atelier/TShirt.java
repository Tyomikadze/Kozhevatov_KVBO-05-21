package zadanie4.atelier;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    private final String name = "футболка";
    public TShirt(Size size, String color, int price) {
        super(size, color, price);
        super.name = "футболка";
    }

    public String getName() {
        return name;
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одел футболку размера " + super.getSize() + ", Цвета: " + super.getColor() + ", Стоимостью: " + super.getPrice());
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина одела футболку размера " + super.getSize() + ", Цвета: " + super.getColor() + ", Стоимостью: " + super.getPrice());
    }
}
