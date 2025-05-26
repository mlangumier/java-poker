import fr.hb.poker.business.*;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println("\n--- POKER ---");

        //--- Create Table (Deck & Players)
        Table table = new Table(5);

        System.out.println(table.getPlayers().toString()); // Displays players (string)
        table.getDeck().displayDeck();  // Displays list of cards (ArrayList)
    }
}