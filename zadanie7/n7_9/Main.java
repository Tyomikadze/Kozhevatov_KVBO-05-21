package zadanie7.n7_9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Printable book1 = new Book("The Black Obelisk");
        Printable book2 = new Book("Głos Pana");
        Printable book3 = new Book("Русские сказки");

        Printable magazine1 = new Magazine("PlayBoy");
        Printable magazine2 = new Magazine("Automation and remote");

        Printable[] arr = {book1, book2, magazine1, book3, magazine2};
        Book.printBooks(arr);
        System.out.println("______________________");
        Magazine.printMagazines(arr);
    }
}
