package fr.hb.poker.business;

public class Color {
    private ColorEnum cardColor;

    public Color(ColorEnum color) {
        this.cardColor = color;
    }

    public ColorEnum getCardColor() {
        return cardColor;
    }

    public void setCardColor(ColorEnum cardColor) {
        this.cardColor = cardColor;
    }

    @Override
    public String toString() {
        return "Color{" +
                "cardColor=" + cardColor +
                '}';
    }
}
