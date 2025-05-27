package fr.hb.poker.business;

import java.time.LocalDate;
import java.util.ArrayList;

public class Player {
    //--- Personal info
    private Long id;
    private String name;
    private LocalDate birthDate;
    private City city;
    private static Long counter = 0L; // Auto-boxing: '0'(L = Long) is placed inside a box, corresponds to an object.
    //--- Game info
    private int points;
    private ArrayList<Card> hand = new ArrayList<>();

    //--- OVERLOADING constructors (FR: surcharge)
    // Allows us to have multiple constructors in case not all attributes are required

    /**
     * Constructor 1: with only the player's basic attributes
     *
     * @param name Name of the player
     */
    public Player(String name) {
        this.id = ++counter;
        this.name = name;
        this.points = 0;
    }

    /**
     * Constructor 2: with the player's attributes and his location
     *
     * @param name Name of the player
     * @param city Location
     */
    public Player(String name, City city) {
        // Instead of repeating the attributes to create the user, we can call the other constructor this way:
        this(name); // this(): is the constructor method of this class (vs `this.something` that refers to the objects of the class)
        this.city = city;
    }

    /**
     * Constructor 3: with the player's attributes and his birthdate
     *
     * @param name      Name of the player
     * @param city      Location of the player
     * @param birthDate Birthdate of the player
     */
    public Player(String name, City city, LocalDate birthDate) {
        this(name, city);
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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
        return "\nPlayer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", city=" + city +
                ", points=" + points +
                ", hand=" + hand +
                "}";
    }
}
