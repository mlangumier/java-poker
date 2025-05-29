package fr.hb.poker.business;

import java.time.LocalDate;
import java.util.*;

public class Table {
    private List<Player> players;
    private Deck deck;
    private CityManager cityManager;

    /**
     * Constructor
     *
     * @param playerNbr Number of players joining the game when it starts {1-5}
     */
    public Table(int playerNbr) {
        cityManager = new CityManager();
        deck = new Deck();
        players = new ArrayList<>();

        // addPlayerV1(playerNbr);
        createPreGeneratedPlayers();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public CityManager getCityManager() {
        return cityManager;
    }

    public void setCityManager(CityManager cityManager) {
        this.cityManager = cityManager;
    }

    /**
     * --- FOR TESTING PURPOSES
     * Generate a few players
     */
    public void createPreGeneratedPlayers() {
        this.players.add(new Player("Matt")); // C1
        // this.players.add(new Player("Sam", cityManager.getCities().stream().filter(city -> Objects.equals(city.getName(), "Villeurbanne".toUpperCase())).toList().getFirst())); // C2
        // this.players.add(new Player("Sam", cityManager.getCities().stream().filter(city -> Objects.equals(city.getName(), "Annecy".toUpperCase())).toList().getFirst(), LocalDate.of(1992, 2, 24))); // C3
    }

    /**
     * Create players with user input and adds them to the table
     *
     * @param count Number of players to create
     */
    public void addPlayerV1(int count) {
        Scanner scanner = new Scanner(System.in);
        String playerName;

        int i = 0;
        while (i < count && this.players.size() < 6) {
            System.out.printf("--- Player %s ---%n", i + 1);
            System.out.print("Enter your name: ");
            playerName = scanner.nextLine();

            this.players.add(new Player(playerName));
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
    public Combination checkHand(Player player) {
        // List<Card> hand = player.getHand();
        List<Card> hand = this.createFakeHand(); //TODO: remove when done

        int[] values = new int[14]; // Set the hand in the array to get their values
        boolean isSameColor = true;
        boolean isFollowing = true;
        int counter = 1;

        // Iterate on hand to get cards value
        for (Card card : hand) {
            int val = card.getValue() - 1;
            values[val]++;
        }

        // Check if all cards are the same color as the first card in the hand
        isSameColor = hand.stream().filter(card -> card.getColor() == hand.getFirst().getColor()).count() == hand.size();

        // Check if pairs

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

        //--- LOGS
        System.out.println("Values: " + Arrays.toString(values));
        // System.out.println("-- Counter: " + counter);


        //--- COMPARE & RETURN
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


        //--- ORDER OF VERIFICATION (IF...ELSE)

        // COLOR + STRAIGHT + ROYALE
//        return Combination.ROYALE_FLUSH;
        // COLOR + STRAIGHT
//        return Combination.STRAIGHT_FLUSH;
        // COLOR
//        return Combination.FLUSH;

        // STRAIGHT
//        return Combination.STRAIGHT;

        // FOUR
//        return Combination.FOUR_OF_A_KIND;

        // THREE + PAIR
//        return Combination.FULL_HOUSE;
        // THREE
//        return Combination.THREE_OF_A_KIND;

        // PAIR + PAIR
//        return Combination.TWO_PAIRS;
        // PAIR
//        return Combination.ONE_PAIR;

        return Combination.HIGH_CARD;
    }

    private List<Card> createFakeHand() {
        List<Card> cardList = deck.getDeck();
        List<Card> fakeHand = new ArrayList<>();

        // Royal Flush: follows top (10 -> Ace), same color (hearts)
//        Collections.addAll(fakeHand, cardList.get(34), cardList.get(38), cardList.get(42), cardList.get(46), cardList.get(50));

        // Straight Flush: follows (7 -> Jack), same color (club)
//        Collections.addAll(fakeHand, cardList.get(20), cardList.get(24), cardList.get(28), cardList.get(32), cardList.get(36));

        // Four of a Kind (7)
//        Collections.addAll(fakeHand, cardList.get(20), cardList.get(21), cardList.get(22), cardList.get(23));

        // Full House: pair (4) + triple (10)
//        Collections.addAll(fakeHand, cardList.get(11), cardList.get(12), cardList.get(33), cardList.get(34), cardList.get(35));

        // Flush: same color (diamond)
//        Collections.addAll(fakeHand, cardList.get(1), cardList.get(5), cardList.get(9), cardList.get(13), cardList.get(17));

        // Straight: follows (4 -> 8)
//        Collections.addAll(fakeHand, cardList.get(8), cardList.get(13), cardList.get(17), cardList.get(23), cardList.get(26));

        // Three of a kind: triple (King)
//        Collections.addAll(fakeHand, cardList.get(44), cardList.get(45), cardList.get(46));

        // Two pairs (4, Ace)
//        Collections.addAll(fakeHand, cardList.get(9), cardList.get(10), cardList.get(49), cardList.get(50));

        // One pair (5)
//        Collections.addAll(fakeHand, cardList.get(14), cardList.get(15));

        // High card (Queen)
        Collections.addAll(fakeHand, cardList.get(41));

        System.out.println("Fake hand: " + fakeHand);
        return fakeHand;
    }

}
