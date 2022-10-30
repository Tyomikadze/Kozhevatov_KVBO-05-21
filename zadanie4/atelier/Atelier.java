package zadanie4.atelier;

public class Atelier {
        public static void dressMen(Clothes[] c) {
            for(Clothes cl : c) {
                if(cl instanceof MenClothing) {
                    System.out.println(cl.getName() + " для мужчин");

                }
            }
        }
        public static void dressWomen(Clothes[] c) {
            for (Clothes cl : c) {
                if(cl instanceof WomenClothing) {
                    System.out.println(cl.getName() + " для женщин");
                }
            }
        }
}
