package zadanie4_1_3;

public class Test {
    public static void main(String[] args) {
        Person lyosha = new Person("Савинов Алексей Олегович", 35);
        Person who = new Person();
        System.out.println(lyosha.move());
        System.out.println(who.talk());
    }
}
