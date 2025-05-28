package fr.hb.poker.business;

public enum Combination {
    ROYALE_FLUSH,       // QUINTE_FLUSH_ROYALE : 10 -> AS
    STRAIGHT_FLUSH,     // QUINTE_FLUSH : Straight all same color
    FOUR_OF_A_KIND,     // CARRE
    FULL_HOUSE,         // FULL : Straight + flush
    FLUSH,              // COULEUR : 5 cards of the same color (not shape)
    STRAIGHT,           // SUITE
    THREE_OF_A_KIND,    // BRELAN : 3 cards with the same value
    TWO_PAIRS,          // DOUBLE_PAIR
    ONE_PAIR,           // PAIR
    HIGH_CARD,          // CARTE_HAUTE
}

