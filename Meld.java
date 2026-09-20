import java.util.ArrayList;

public class Meld {
    private ArrayList<Dice> meldDice;

    public Meld() {
        meldDice = new ArrayList<>();
    }

    public void addDie(Dice die) {
        meldDice.add(die);
    }

    public void displayMeld() {
        for (int row = 0; row < 5; row++) {
            for (Dice die : meldDice) {
                System.out.print(die.getDiceArt()[row] + " ");
            }
            System.out.println();
        }
    }
}