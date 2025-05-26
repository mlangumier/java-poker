package fr.hb.poker.business;

import java.util.ArrayList;

public class Deck {
    private final ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
    }

    public void generateDeck() {
        String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        ArrayList<Color> colors = new ArrayList<>();
        colors.add(new Color("Club"));
        colors.add(new Color("Diamond"));
        colors.add(new Color("Heart"));
        colors.add(new Color("Spade"));


        for (int i = 0; i < names.length; i++) {
            for (Color color : colors) {
                deck.add(new Card(names[i], i + 2, color));
            }
        }
    }

    public void displayDeck() {
        System.out.printf("----- DECK (%s cards) -----%n", deck.size());
        for (Card card : deck) {
            System.out.println(card);
        }
    }
}
