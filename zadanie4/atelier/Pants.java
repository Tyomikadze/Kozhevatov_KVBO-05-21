package zadanie4.atelier;

public class Pants extends Clothes implements MenClothing, WomenClothing{

    public Pants(Size size, String color, int price) {
        super(size, color, price);
        super.name = "штаны";
    }



    @Override
    public void dressMan() {
        System.out.println("Мужчина одел штаны размера " + super.getSize() + ", Цвета: " + super.getColor() + ", Стоимостью: " + super.getPrice());
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина одела штаны размера " + super.getSize() + ", Цвета: " + super.getColor() + ", Стоимостью: " + super.getPrice());

    }
}
