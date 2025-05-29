package fr.hb.poker.business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private static final String[] cardNames = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    List<Color> cardColors = new ArrayList<>();
    private final List<Card> deckOfCards;

    /**
     * Constructor that calls a method to create a deck of 52 cards
     */
    public Deck() {
        deckOfCards = new ArrayList<>();
        generateDeck();
    }

    public List<Card> getDeck() {
        return deckOfCards;
    }

    /**
     * Generate a deck of card
     */
    public void generateDeck() {
        cardColors.add(new Color(ColorEnum.CLUB));
        cardColors.add(new Color(ColorEnum.DIAMOND));
        cardColors.add(new Color(ColorEnum.HEART));
        cardColors.add(new Color(ColorEnum.SPADE));

        for (int i = 0; i < cardNames.length; i++) {
            for (int j = 0; j < 4; j++) {
                deckOfCards.add(new Card(cardNames[i], i + 2, cardColors.get(j)));
            }
        }
    }

    /**
     * Shuffles our deck of cards to randomize their order in the array
     */
    public void shuffleDeck() {
        Collections.shuffle(deckOfCards);
    }

    /**
     * Displays the list of cards present in the deck
     */
    public void displayDeck() {
        System.out.printf("%n----- DECK (%s cards) -----%n", deckOfCards.size());

        for (Card card : deckOfCards) {
            System.out.printf("- %s of %s (%s)%n", card.getName(), card.getColor(), card.getValue());
        }
    }
}
