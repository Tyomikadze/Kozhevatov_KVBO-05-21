package zadanie2;

import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Tyoma Kozhevatov", 2022, "My Struggle");
        System.out.println(book1.getAuthor() + "\n" + book1.getName() + "\n" + book1.getYear());


        BookShelf shelf = new BookShelf();
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Nikita", 2002, "LOLOLO"));
        books.add(new Book("Strugatskie", 1972, "Piknik na obochine"));
        books.add(new Book("Valeriy Krimkin", 2013, "In my head"));
        books.add(new Book("Dmitriy Lushin", 2094, "Chto ti delaesh"));
        shelf.setBooks(books);
        shelf.earliestBook();
        shelf.lastestBook();

    }
}
