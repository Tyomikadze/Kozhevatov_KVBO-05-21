package zadanie2;
import java.util.ArrayList;

public class DogsNursery {
    private ArrayList<Dog> dogs;

    public DogsNursery()
    {
        dogs = new ArrayList<Dog>();
    }
    public void addDog(Dog d)
    {
        dogs.add(d);
    }

    public static void main(String[] args) {
        Dog tuzik = new Dog("Tuzik", 3);
        Dog sharik = new Dog("Sharik", 4);
        tuzik.toHuman();
        System.out.println(sharik.toString());
        DogsNursery nurs = new DogsNursery();
        nurs.addDog(tuzik);
        nurs.addDog(sharik);
        for (Dog d : nurs.dogs)
        {
            System.out.println(d.getName());
        }
    }
}
