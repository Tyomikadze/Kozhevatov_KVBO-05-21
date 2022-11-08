package Shop;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login;
        String password;
        List<Product> list = Arrays.asList(new Product("Bear", 160, Catalog.TOY), new Product("Doll", 200, Catalog.TOY),
                new Product("Nissan", 2000, Catalog.CAR), new Product("Toyota", 2500, Catalog.CAR));
        ArrayList<Product> dispList = new ArrayList<Product>();

        loop1:
        while(true) {
            System.out.println("Login: ");
            login = sc.nextLine();
            if (login.equals(Users.USER1.getLogin()) | login.equals(Users.USER2.getLogin())) {
                break loop1;
            }else System.out.println("Invalid login, try again");
        }
        loop2:
        while (true) {
            System.out.println("Password: ");
            password = sc.nextLine();
            if(login.equals(Users.USER1.getLogin()) && password.equals(Users.USER1.getPassword())) {
                break loop2;
            } else if(login.equals(Users.USER2.getLogin()) && password.equals(Users.USER2.getPassword())) {
                break loop2;
            } else System.out.println("Invalid password, try again");
        }
        loop3:
        while(true) {
            System.out.println("Catalogs: \n " + "1. " + Catalog.TOY.getCtgName() + "\n 2. " + Catalog.CAR.getCtgName());
            System.out.println("Enter a number of catalog: ");
            switch (sc.nextInt()) {
                case 1:
                    for (Product p : list) {
                        if (p.getNameCtg() == Catalog.TOY) {
                            dispList.add(p);
                            System.out.println(p.getName() + " " + p.getPrice());
                        }
                    }
                    System.out.println("Enter a product number you want to add to cart: ");
                    int i = sc.nextInt();
                    if(i < dispList.size() + 1) {
                        Bin.addProduct(dispList.get(i - 1));
                    } else System.out.println("This product doesn't exist");
                    dispList.clear();
                    System.out.println("Checkout - enter 0");
                    break;
                case 2:
                    for (Product p : list) {
                        if (p.getNameCtg() == Catalog.CAR) {
                            dispList.add(p);
                            System.out.println(p.getName() + " " + p.getPrice());
                        }
                    }
                    System.out.println("Enter a product number you want to add to cart: ");
                     i = sc.nextInt();
                    if(i < dispList.size() + 1) {
                        Bin.addProduct(dispList.get(i - 1));
                    } else System.out.println("This product doesn't exist");
                    dispList.clear();
                    System.out.println("Checkout - enter 0");
                    break;
                case 0:
                    break loop3;
                default:
                    System.out.println("Catalog doesn't exist");
                    break;
            }
        }
        System.out.println("Cart list:");
        for(Product p : Bin.prodList) {
            System.out.println(p.getName() + " " + p.getPrice() + "$");
        }
        System.out.println("To pay: " + Bin.getCheck() + "$");
    }
}
