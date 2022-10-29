package zadanie2;
import java.util.Scanner;

public class Poker {

    public static void main(String[] args) {


        int cpp = 5;
        int players =0 ;

        String[] suits = {
                "♠", "♦", "♥", "♣"
        };

        String[] rank = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "J", "Q", "K", "A"
        };

        int n = suits.length * rank.length;

        for(;;){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество игроков: ");
            if(sc.hasNextInt()){
                players = sc.nextInt();
                if(cpp * players <= n){
                    break;
                } else System.out.println("Некорректный ввод!!!");
            }
        }

        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length*i + j] = rank[i] + " " + suits[j];
            }
        }

        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i)); //rand card
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        for (int i = 0; i < players * cpp; i++) {
            System.out.println(deck[i]);
            if (i % cpp == cpp - 1)
                System.out.println();
        }
    }

}