package fr.hb.poker.business;

import java.util.ArrayList;

public class City {
    private String name;
    private String postcode;
    private Double latitude;
    private Double longitude;
    private ArrayList<Player> players;

    //--- Overloading constructors (surcharge)
    // Allows us to have multiple constructors in case not all attributes are required

    /**
     * Constructor with one param (only need name, ex: search city's name in Google API)
     *
     * @param name Name of the city
     */
    public City(String name) {
        this.name = name;
    }

    /**
     * Constructor with two params (don't need coordinates)
     *
     * @param name     Name of the city
     * @param postcode Postcode of the city
     */
    public City(String name, String postcode) {
        this.name = name;
        this.postcode = postcode;
    }

    /**
     * Constructor with all the params
     *
     * @param name      Name of the city
     * @param postcode  Postcode of the city
     * @param latitude  {Coordinate} Latitude of the city
     * @param longitude {Coordinate} Longitude of the city
     */
    public City(String name, String postcode, Double latitude, Double longitude) {
        this.name = name;
        this.postcode = postcode;
        this.latitude = latitude;
        this.longitude = longitude;
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

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", postcode='" + postcode + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
