package fr.hb.poker.business;

public class Player {
    private String name;
    private int points;
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

    public String getname() {
        return name;
    }

    public void setname(String name) {
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

    /**
     * @return A string containing our player's information
     */
    @Override
    public String toString() {
        return String.format("%s's score: %s", name, points);
    }
}
