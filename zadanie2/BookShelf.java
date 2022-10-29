package zadanie2;

import java.util.ArrayList;
import java.util.Collections;

public class BookShelf {
    ArrayList<Book> books;
    int quant;

    public BookShelf()
    {
        books = new ArrayList<Book>();
    }
    public void setBooks(ArrayList<Book> b)
    {
        this.books = b;
        quant = books.size();
    }
    public Book earliestBook() {
        for (int i = 0; i < books.size() - 1; i++) {
            if (books.get(i + 1).getYear() < books.get(i).getYear()) {
                Collections.swap(books, i, i + 1);
            }
        }
        System.out.println("Earliest book: " + books.get(0).getName() + " " + books.get(0).getYear());
        return books.get(0);
    }

    public Book lastestBook() {
        for (int i = 0; i < books.size() - 1; i++) {
            if (books.get(i + 1).getYear() < books.get(i).getYear()) {
                Collections.swap(books, i, i + 1);
            }
        }
        System.out.println("Lastest book: " + books.get(books.size() - 1).getName() + " " +books.get(books.size() - 1).getYear());
        return books.get(books.size() - 1);
    }
}
