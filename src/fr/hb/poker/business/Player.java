package fr.hb.poker.business;

import java.util.ArrayList;

public class Player {
    private String name;
    private int points;
    private ArrayList<Card> hand = new ArrayList<>();
    private City city;

    /**
     * Constructor with only the player's basic attributes
     *
     * @param name First name of the player
     */
    public Player(String name) {
        this.name = name;
        this.points = 0;
    }

    /**
     * Constructor with the player's attributes and his location
     *
     * @param name First name of the player
     * @param city Location
     */
    public Player(String name, City city) {
        this.name = name;
        this.points = 0;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    /**
     * Shows the cards in the hand of a player
     */
    public void showHand() {
        System.out.printf("%n--- %s's hand ---%n", this.getName());

        for (Card card : hand) {
            System.out.println("- " + card.toString());
        }
    }

    /**
     * @return A string containing our player's information
     */
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", points=" + points +
                ", hand=" + hand +
                '}';
    }
}
