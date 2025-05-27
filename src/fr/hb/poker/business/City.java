package fr.hb.poker.business;

import java.util.ArrayList;

public class City {
    private Long id;
    private String name;
    private String postcode;
    private Double latitude;
    private Double longitude;
    private ArrayList<Player> players;
    private static Long counter = 0L;

    /**
     * Default constructor
     * Tips: Java creates automatically a default constructor (without any parameters)
     */
    public City() {
        id = ++counter;
    }

    /**
     * Constructor 1: with one param (only need name, ex: search city's name in Google API)
     *
     * @param name Name of the city
     */
    public City(String name) {
        this();
        this.name = name;
    }

    /**
     * Constructor 2: with two params (don't need coordinates)
     *
     * @param name     Name of the city
     * @param postcode Postcode of the city
     */
    public City(String name, String postcode) {
        this(name);
        this.postcode = postcode;
    }

    /**
     * Constructor 3: with all the params
     *
     * @param name      Name of the city
     * @param postcode  Postcode of the city
     * @param latitude  {Coordinate} Latitude of the city
     * @param longitude {Coordinate} Longitude of the city
     */
    public City(String name, String postcode, Double latitude, Double longitude) {
        this(name, postcode);
        this.latitude = latitude;
        this.longitude = longitude;
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

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", postcode='" + postcode + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", players=" + players +
                '}';
    }
}
