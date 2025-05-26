import fr.hb.poker.business.City;
import fr.hb.poker.business.Player;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- POKER ---");

        City cityStEtienne = new City("St-Etienne", "42100");
        City cityLyon = new City("Villeurbanne", "69100");

        Player firstPlayer = new Player("Mathieu", "Langumier");
        firstPlayer.setCity(cityStEtienne);
        Player secondPlayer = new Player("Samuel", "William", cityLyon);

        System.out.println(firstPlayer.toString());
        System.out.println(secondPlayer.toString());
    }
}