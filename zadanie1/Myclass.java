package mypackage.zadanie1;
import java.util.Scanner;
import java.math.*;

public class Myclass {
    public static void main(String[] args) {
//        Написать программу, в результате которой массив чисел создается с помощью инициализации (как в Си) вводится и считается в цикле сумма элементов целочисленного массива, а также среднее арифметическое его элементов результат выводится на экран. Использовать цикл for.
//        int[] arr = {4, -8, 5, -10};
//        float sum = 0f;
//        float sred = 0f;
//        for (int i = 0; i < arr.length; i++ )
//        {
//            sum += arr[i];
//        }
//        sred = sum / arr.length;
//        System.out.println("Сумма элементов массива = " + sum);
//        System.out.println("Среднее арифметическое = " + sred);


//     	Написать программу, в результате которой массив чисел вводится пользователем с клавиатуры считается сумма элементов целочисленного массива с помощью циклов do while, while, также необходимо найти максимальный и минимальный элемент в массиве, результат выводится на экран.
        int sz;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        sz = sc.nextInt();
        int arr[] = new int[sz];
        System.out.println("Введите массив длины " + sz + ": ");
        for (int i = 0; i < sz; i++)
        {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int sum = 0;
        int min = arr[0];
        int max = arr[0];
        while (i < arr.length)
        {
            sum += arr[i];
            i++;
        }
        for (int j = 0; j < arr.length; j++)
        {
            max = Math.max(max, arr[j]);
            min = Math.min(min, arr[j]);
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);


//	Написать программу, в результате которой выводятся на экран аргументы командной строки в цикле for.
//        for(int i = 0; i < args.length; i ++)
//        {
//            System.out.println("args[" + i + "] = " + args[i]);
//        }


// 	Написать программу, в результате работы которой выводятся на экран первые 10 чисел гармонического ряда (форматировать вывод).
//        System.out.print("1 ");
//        for (int i = 2; i < 11; i++)
//            {
//                System.out.print("1" + "/" + i + " ");
//            }


//  Написать программу, которая с помощью метода класса, вычисляет факториал числа (использовать управляющую конструкцию цикла), проверить работу метода.
//        int n = 9;
//        Mymath.factorial(n);
    }
}



