package fr.hb.poker.business;

public class Card {
    private String name;
    private int value;
    private Color color;

    /**
     * Constructor - Creates a card
     *
     * @param name  Name of the card (2, 7, Jack, King, etc.)
     * @param value Defines the value of the card (numerical)
     * @param color Defines the color of the card (Club, Diamond, Heart, Spade)
     */
    public Card(String name, int value, Color color) {
        this.name = name;
        this.value = value;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s of %s (%s)", this.getName(), this.getColor().getName(), this.getValue());
    }
}
