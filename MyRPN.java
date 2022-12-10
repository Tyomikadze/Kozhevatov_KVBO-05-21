package zadanie22;

import java.io.*;
import java.util.*;

public class MyRPN {
    private static double evalrpn(Stack<String> st) throws Exception {
        String exp = st.pop();
        double x,y;
        try {x = Double.parseDouble(exp);}
        catch (Exception e) {
            y = evalrpn(st);
            x = evalrpn(st);
            switch (exp) {
                case "+" -> x += y;
                case "-" -> x -= y;
                case "*" -> x *= y;
                case "/" -> x /= y;
                default -> throw new Exception();
            }
        }
        return x;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println("Введите выражение");
            String s = sc.nextLine();
            if (s==null) break;
            Stack<String> st = new Stack<String>();
            st.addAll(Arrays.asList(s.trim().split("[ \t]+")));
            if (st.peek().equals("")) continue;


            try {
                double result = evalrpn(st);
                if (!st.empty()) throw new Exception();
                System.out.println("Ответ: " + result);
            }
            catch (Exception e) {System.out.println("Ввод ни к черту, попробуй еще раз!!!");}
        }
    }
}