package fr.hb.poker.business;

import java.time.LocalDate;
import java.util.*;

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
//        this.players.add(new Player("Sam", new City("Villeurbanne"))); // C2
//        this.players.add(new Player("William", new City("Annecy"), LocalDate.of(1992, 2, 24))); // C3
//        this.players.add(new Player("James", new City("Lyon", "69003"), LocalDate.of(1992, 2, 24))); // C3
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

    /**
     * Checks the player's hand for the combination with the highest winning chance
     *
     * @param player The player whose hand we want to analyze
     * @return The best combination the player has
     */
    public Combination checkHands(Player player) {
        ArrayList<Card> hand = player.getHand();

        int[] values = new int[14]; // Set the hand in the array to get their values
        boolean isSameColor = true;
        boolean isFollowing = true;
        int counter = 1;
        HashSet<Card> cardsPair = new HashSet<>();

        // Iterate on hand to get values
        for (Card card : hand) {
            int val = card.getValue() - 1;
            values[val]++;

            // Check pairs here?
        }

        // Check if all cards are the same color as the first card in the hand
        isSameColor = hand.stream().filter(card -> card.getColor() == hand.getFirst().getColor()).count() == hand.size();

        // Check if pairs
        //

        // Check if flush (suite)
        for (int i = 0; i < values.length - 1; i++) {
            if (counter >= 5) {
                break;
            } else if (values[i] >= 2 || (counter >= 2 && (values[i] != values[i + 1]))) {
                isFollowing = false;
                break;
            } else if ((values[i] != 0) && (values[i] == values[i + 1])) {
                counter++;
            }
        }


        //--- Logs
        System.out.println("Values: " + Arrays.toString(values));
        // System.out.println("-- Counter: " + counter);


        //--- COMPARE & RETURN
        // TODO: Transform into Switch-Case:
        // - Get Combination from methods for each Score, then show result (string) here
        if (isSameColor) {
            System.out.println("IsSameColor: " + isSameColor);
            // TODO: if(isFlush) {} else {}

            return Combination.FLUSH;
        }

        if (isFollowing) {
            System.out.println("isFlush: " + isFollowing);
            return Combination.FLUSH;
        }

        /*if (!pairs.isEmpty()) {
            System.out.println("Pairs (" + pairs.size() + "): " + pairs);

            if (pairs.size() == 2) {
                return Combination.TWO_PAIRS;
            } else {
                return Combination.ONE_PAIR;
            }
        }*/

        return Combination.HIGH_CARD;

    }
}
