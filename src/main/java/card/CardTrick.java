/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package card;


/**
 * Modifier: Hala Isaa Ayoub  (Student#: 991760069)
 */



import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rnd = new Random();

        Card c1 = new Card();
        c1.setSuit("Diamonds");
        c1.setValue(1);

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rnd.nextInt(13) + 1);
            c.setSuit(SUITS[rnd.nextInt(SUITS.length)]);
            magicHand[i] = c;
        }

        for (Card c : magicHand) {
            System.out.println(c.getSuit() + " " + c.getValue());
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int val = sc.nextInt();
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int suitIndex = sc.nextInt();

        String[] Suits = {"Hearts", "Diamonds", "Clubs", "Spades"};//change the name 
        Card userCard = new Card();
        userCard.setValue(val);
        userCard.setSuit(Suits[suitIndex]);

        boolean found = false;
        for (Card c : magicHand) {
            if (c.equals(userCard)) { found = true; break; }
        }

        if (found) {
            System.out.println("Congrats, your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
}
