package zadanie4_1_7;

public abstract class Learner {
    private int age;
    private final String name;

    protected Learner(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
