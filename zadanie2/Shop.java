package zadanie2;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private ArrayList <Computer> comps;
    public Shop()
    {
        comps = new ArrayList<Computer>();
    }




    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя компьютера: ");
        String s = sc.next();
        Computer c = new Computer(s);
        comps.add(c);
    }


    public void delete(String name) {
        int  i = 0;
        for (Computer c : comps)
        {
            if(c.getName().equals(name))
            {
                comps.remove(c);
                System.out.println("Компьютер удален");
                break;
            }
        }
        for (Computer c : comps)
        {
            if(c.getName().equals(name))
            {
                i++;
            }
        }
        if (i == 0)
        {
            System.out.println("Компьютера для удаления не существует");
        }
    }


    public void delete(int i)
    {
        if (i < comps.size() && i >= 0)
        {
            comps.remove(i);
            System.out.println("Компьютер удален");
        }
        else System.out.println("Компьютера для удаления не существует");
    }

    public void showShop()
    {
        for (int i = 0; i < comps.size(); i++)
        {
            System.out.println(i+1 + ". " + comps.get(i).getName());
        }
    }
    public Computer searchComputer()
    {
        Computer finded = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Поиск по имени: ");
        String s = sc.next();
        for (Computer c : comps)
        {
            if(c.getName().equals(s))
            {
                finded = c;
                System.out.println("Компьютер найден!");
                break;
            }
        }
        if (finded == null)
        {
            System.out.println("Такого компьютера нет :(");
        }
        return finded;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.add();
        shop.add();
        shop.add();
        shop.searchComputer();
        shop.showShop();
        shop.delete(6);
        shop.showShop();
    }
}