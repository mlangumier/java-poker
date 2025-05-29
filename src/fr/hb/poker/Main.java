package fr.hb.poker;

import fr.hb.poker.business.Player;
import fr.hb.poker.business.Table;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n----- POKER -----\n");

        //----- GAME STARTS -----\\

        // Creates the deck and the first players
        Table table = new Table(2);

        // Shuffles the deck
        table.getDeck().shuffleDeck();

        // Hands out 5 cards to each player
        table.handOutCard(5);

        // Shows every players hand
        // table.showPlayersHands();

        // Checks players hands for score
        for (Player player : table.getPlayers()) {
            System.out.print("- " + player.getName() + "'s hand: " + table.checkHand(player) + "\n");
        }
    }
}