import fr.hb.poker.business.Player;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("--- POKER ---");
        Player player1 = new Player("Mathieu");

        System.out.print("- " + player1.getName());
    }
}