package zadanie2;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String s1 = sc.nextLine();
        if(s1.charAt(0) == ' ') {
            i = s1.split(" +").length - 1;
        }
        else {
            i = s1.split(" +").length;
        }
        System.out.println(i);
    }
}
