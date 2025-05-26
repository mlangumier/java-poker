import fr.hb.poker.business.*;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\n----- POKER -----\n");

        //----- INIT TABLE -----\\
        // Creates the deck and the first players
        Table table = new Table(5);

        // Shuffles the deck
        table.getDeck().shuffleDeck();
        // table.getDeck().displayDeck();  // Shows full list of cards (ArrayList)


        // Hands out 5 cards to each player
        table.handOutCard(5);

        //----- DISPLAY LOG INFO -----\\
        // System.out.println(table.getPlayers().toString()); // Displays players (string)
        // System.out.println("Deck size: " + table.getDeck().getDeck().size());
        table.showPlayersHands();
    }
}