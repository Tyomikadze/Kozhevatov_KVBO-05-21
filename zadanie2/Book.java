package zadanie2;

import java.util.Comparator;

public class Book  {
    private String author;
    private int year;
    private String name;

    public Book(String a, int y, String n)
    {
        this.author = a;
        this.year = y;
        this.name = n;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
