package zadanie2;

public class Dog {
    private int age;
    private String name;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public Dog()
    {
        this.name = "Unnamed doggy";
        age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int toHuman()
    {
        int hum = age * 7;
        System.out.println("Возраст собаки " + name + " В человеческих годах = " + hum);
        return hum;
    }
    @Override
    public String toString()
    {
        return "Dog {name: " + name + ", age: " + age + "}";
    }
}
