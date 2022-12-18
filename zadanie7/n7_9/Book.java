package zadanie7.n7_9;

public class Book implements Printable {
    private final String title;

    public Book(String title) {
        this.title = title;
    }
    Book() {
        this.title = "Unnamed book";
    }

    public String getTitle() {
        return title;
    }

    public static void printBooks(Printable[] arr) {
        for (Printable p : arr) {
            if(p instanceof Book) {
                System.out.println(((Book) p).getTitle());
            }
        }
    }

}
