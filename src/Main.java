import fr.hb.poker.business.City;
import fr.hb.poker.business.Player;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- POKER ---");

        Player playerTest = new Player("Mathieu", "Langumier");
        System.out.println(playerTest.toString());

        City cityTest = new City("St-Etienne", "42100");
        System.out.println(cityTest.toString());
    }
}