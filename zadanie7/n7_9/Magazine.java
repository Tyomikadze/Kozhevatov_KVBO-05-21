package zadanie7.n7_9;

public class Magazine implements Printable {
    private final String title;

    public Magazine(String title) {
        this.title = title;
    }
    Magazine() {
        this.title = "Unnamed magazine";
    }

    public String getTitle() {
        return title;
    }

    public static void printMagazines(Printable[] arr) {
        for (Printable p : arr) {
            if (p instanceof Magazine) {
                System.out.println(((Magazine) p).title);
            }
        }
    }
}
