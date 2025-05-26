package fr.hb.poker.business;

public class Player {
    private String firstName;
    private String lastName;
    private int points;
    private City city;

    /**
     * Constructor with only the player's basic attributes
     *
     * @param firstName First name of the player
     * @param lastName  Last name of the player
     */
    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = 0;
    }

    /**
     * Constructor with the player's attributes and his location
     *
     * @param firstName First name of the player
     * @param lastName  Last name of the player
     * @param city      Location
     */
    public Player(String firstName, String lastName, City city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = 0;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    /**
     * @return A string containing our player's information
     */
    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName.toUpperCase() + '\'' +
                ", points=" + points +
                ", city=" + city +
                '}';
    }
}
