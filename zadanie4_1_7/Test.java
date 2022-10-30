package zadanie4_1_7;

public class Test {
    public static void main(String[] args) {
        Learner[] arr = {new SchoolBoy(12, 6, "Oleg"), new Student(21, 4, "Dima"),
                        new Student(18, 1, "Lyosha"), new SchoolBoy(8, 2, "Sasha")};
        for (Learner l : arr) {
            if (l instanceof Student) {
                System.out.println("Студент " + l.getName());
            }
            else System.out.println("Школьник " + l.getName());
        }
    }
}
