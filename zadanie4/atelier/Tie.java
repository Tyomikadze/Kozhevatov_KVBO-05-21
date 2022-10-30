package zadanie4.atelier;

public class Tie extends Clothes implements MenClothing {
    private final String name = "галстук";
    public Tie(Size size, String color, int price) {
        super(size, color, price);
        super.name = "галстук";
    }

    public String getName() {
        return name;
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одел галстук размера " + super.getSize() + ", Цвета: " + super.getColor() + ", Стоимостью: " + super.getPrice());
    }
}
