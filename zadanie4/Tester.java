package zadanie4;
import zadanie4.atelier.*;
import zadanie4.seasons.Season;

public class Tester {
    public static void main(String[] args) {
        Season s = Season.WINTER;

        switch(s) {
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
        }
        System.out.println("_____________________________________");

        for(Season season : Season.values()){
            System.out.println(season + " " + season.getTermo() + " " + season.getDescription());
        }

        System.out.println("_____________________________________");

        Clothes[] arr = {new TShirt(Size.S, "red", 120),
                         new Tie(Size.M, "blue", 200),
                         new Skirt(Size.XS, "white", 100),
                         new Pants(Size.L, "black", 80)};
        Atelier.dressMen(arr);
        Atelier.dressWomen(arr);

    }
}
