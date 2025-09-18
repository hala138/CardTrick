/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * Modifier: Hala Isaa Ayoub  (Student#: 991760069)
 */

public class Card {
    private int value;
    private String suit;

    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }

    public String getSuit() { return suit; }
    public void setSuit(String suit) { this.suit = suit; }

    @Override
    public String toString() { return suit + " " + value; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card c = (Card) o;
        return value == c.value && suit.equals(c.suit);
    }

    @Override
    public int hashCode() {
        int r = Integer.hashCode(value);
        return 31 * r + suit.hashCode();
    }
}
