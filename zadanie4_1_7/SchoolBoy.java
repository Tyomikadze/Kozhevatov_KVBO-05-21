package zadanie4_1_7;

public class SchoolBoy extends Learner{
    private final int clas;
    protected SchoolBoy(int age, int clas, String name) {
        super(age, name);
        this.clas = clas;
    }
}
