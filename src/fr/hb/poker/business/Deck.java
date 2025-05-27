package fr.hb.poker.business;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private final ArrayList<Card> deck;

    /**
     * Constructor that calls a method to create a deck of 52 cards
     */
    public Deck() {
        deck = new ArrayList<>();
        generateDeck();
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    /**
     * Generate a deck of card
     */
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

    /**
     * Shuffles our deck of cards to randomize their order in the array
     */
    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    /**
     * Displays the list of cards present in the deck
     */
    public void displayDeck() {
        System.out.printf("%n----- DECK (%s cards) -----%n", deck.size());
        for (Card card : deck) {
            System.out.printf("- %s of %s (%s)%n", card.getName(), card.getColor().getName(), card.getValue());
            // System.out.printf("- %s of %s (%s)%n", card.getName(), card.getColor().getName(), card.getValue());
        }
    }
}
