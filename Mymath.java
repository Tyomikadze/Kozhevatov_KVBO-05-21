package mypackage.zadanie1;

public class Mymath {
    public static int factorial(int n)
    {
        int fac = 1;
        for (int i = 1; i <= n; i++)
        {
            fac = fac * i;
        }
        System.out.println("Факториал числа = " + fac);
        return fac;
    }
}
