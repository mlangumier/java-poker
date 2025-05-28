import fr.hb.poker.business.*;
import fr.hb.poker.business.CityManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\n----- POKER -----\n");

        //----- INIT TABLE -----\\
        // Creates the deck and the first players
        Table table = new Table(2);

        // Shuffles the deck
        table.getDeck().shuffleDeck();

        // Hands out 5 cards to each player
        table.handOutCard(5);

        // Checks players hands for score
        /*for (Player player : table.getPlayers()) {
            System.out.print("--- " + player.getName() + "'s hand: " + table.checkHands(player) + "\n");
        }*/

        //----- DISPLAY LOG INFO -----\\
        // System.out.println(table.getPlayers().toString()); // Displays players (string)
        // System.out.println("Deck size: " + table.getDeck().getDeck().size());
        // table.showPlayersHands();
        // table.getDeck().displayDeck();  // Shows full list of cards (ArrayList)


        //----- CSV FILE -----\\
        CityManager cityManager = new CityManager();
        cityManager.readCSVFile("cities.csv");

        cityManager.createCitiesFromCSVArray();
        System.out.println(cityManager.getCities());
    }
}