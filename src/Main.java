import fr.hb.poker.business.*;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- POKER ---\n");

        //----- INIT TABLE -----\\
        Table table = new Table(1); // Creates the deck and the first players
        table.getDeck().shuffleDeck(); // Shuffles the deck
        table.handOutCard(5); // Hands out 5 cards to each player

        //----- DISPLAY LOG INFO -----\\
        // System.out.println(table.getPlayers().toString()); // Displays players (string)
        // table.getDeck().displayDeck();  // Displays list of cards (ArrayList)
        table.showPlayersHands();
    }
}