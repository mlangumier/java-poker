package fr.hb.poker.business;

import java.util.ArrayList;
import java.util.Scanner;

public class Table {
    private ArrayList<Player> players = new ArrayList<>();
    private Deck deck = new Deck();

    /**
     * Constructor
     *
     * @param playerNbr Number of players when the game starts
     */
    public Table(int playerNbr) {
        addPlayerV1(playerNbr);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    /**
     * Create players and add them to the table
     *
     * @param count Number of players to create
     */
    public void addPlayerV1(int count) {
        Scanner scanner = new Scanner(System.in);
        String firstName;

        int i = 0;
        while (i < count) {
            System.out.printf("-- New Player (%s) --%n", i + 1);
            System.out.print("Enter your first name: ");
            firstName = scanner.nextLine();

            this.players.add(new Player(firstName));
            i++;
        }

        scanner.close();
    }

    // handOutCards

}
