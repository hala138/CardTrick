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

        // replace the user input with a hard-coded luckyCard
   Card luckyCard = new Card();
luckyCard.setValue(2);
luckyCard.setSuit("Clubs");

boolean found = false;
for (Card c : magicHand) {
    if (c.equals(luckyCard)) {
        found = true;
        break;
    }
}

System.out.println("\nLucky card: " + luckyCard.getSuit() + " " + luckyCard.getValue());
if (found) {
    System.out.println("Congrats, your lucky card is in the magic hand!");
} else {
    System.out.println("Sorry, your lucky card is not in the magic hand.");
}


