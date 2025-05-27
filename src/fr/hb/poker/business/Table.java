package fr.hb.poker.business;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Table {
    private ArrayList<Player> players = new ArrayList<>();
    private Deck deck = new Deck();

    /**
     * Constructor
     *
     * @param playerNbr Number of players joining the game when it starts {1-5}
     */
    public Table(int playerNbr) {
        // addPlayerV1(playerNbr);
        createPreGeneratedPlayers();
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

    public void createPreGeneratedPlayers() {
        this.players.add(new Player("Matt")); // C1
        this.players.add(new Player("Sam", new City("Villeurbanne"))); // C2
        this.players.add(new Player("William", new City("Annecy"), LocalDate.of(1992, 2, 24))); // C3
        this.players.add(new Player("James", new City("Lyon", "69003"), LocalDate.of(1992, 2, 24))); // C3
    }

    /**
     * Create players with user input and adds them to the table
     *
     * @param count Number of players to create
     */
    public void addPlayerV1(int count) {
        Scanner scanner = new Scanner(System.in);
        String firstName;

        int i = 0;
        while (i < count && this.players.size() < 6) {
            System.out.printf("--- Player %s ---%n", i + 1);
            System.out.print("Enter your name: ");
            firstName = scanner.nextLine();

            this.players.add(new Player(firstName));
            i++;
        }

        scanner.close();
    }

    /**
     * Hands out 5 card to all players
     */
    public void handOutCard(int counter) {
        for (int i = 0; i < counter; i++) {
            for (Player player : this.players) {
                Card card = deck.getDeck().getFirst();

                player.getHand().add(card);
                deck.getDeck().remove(card);
            }
        }
    }

    /**
     * Shows the hand of all players
     */
    public void showPlayersHands() {
        for (Player player : this.getPlayers()) {
            player.showHand();
        }
    }
}
