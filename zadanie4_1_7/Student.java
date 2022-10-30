package zadanie4_1_7;

public class Student extends Learner {
    private final int kurs;
    protected Student(int age, int kurs, String name) {
        super(age, name);
        this.kurs = kurs;
    }
}
