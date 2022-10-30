package zadanie4_1_3;

public class Person {
    private final String fullName;
    private int age;
    Person() {
        this.fullName = "Какой-то подозрительный тип";
        this.age = 99;
    }
    Person(String name, int age) {
        this.fullName = name;
        this.age = age;
    }
    public String talk() {
        return fullName + " говорит";
    }
    public String move() {
        return fullName + " крадёца";
    }
}
