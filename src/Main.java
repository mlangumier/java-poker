import fr.hb.poker.business.*;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- POKER ---");

        //--- Generate card deck
        Deck deck = new Deck();
        deck.generateDeck();
        deck.displayDeck();

        //--- Creating cities
        City cityStEtienne = new City("St-Etienne", "42100");
        City cityLyon = new City("Villeurbanne", "69100");

        //--- Creating players & adding cities
        Player firstPlayer = new Player("Mathieu", "Langumier");
        firstPlayer.setCity(cityStEtienne); // Works if we add the city later, but prefer using Player's constructor
        Player secondPlayer = new Player("Samuel", "William", cityLyon);

        System.out.println(firstPlayer.toString());
        System.out.println(secondPlayer.toString());

        System.out.println(cityStEtienne.toString());
    }

}