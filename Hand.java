import java.util.ArrayList;

public class Hand {

    private ArrayList<Dice> diceList;
    private ArrayList<Dice> unused;
    private Meld meld;

    public Hand() {
        diceList = new ArrayList<>();
        unused = new ArrayList<>();
        meld = new Meld();

        for (int i = 0; i < 6; i++) {
            Dice die = new Dice();
            diceList.add(die);
            unused.add(die);
        }
    }

    public void rollAllDice() {
        for (Dice die : diceList) {
            die.roll();
        }
    }

    public void displayUnusedDice() {
        for (int row = 0; row < 5; row++) {
            for (Dice die : unused) {
                System.out.print(die.getDiceArt()[row] + " ");
            }
            System.out.println();

        }
        System.out.println("    A         B         C         D         E         F");
    }

    public void addToMeld(int index) {
        //Dice die = unused.get(index);
        //meld.addDie(die);
        Dice removedDie = unused.remove(index);
        meld.addDie(removedDie);
    }

    public void displayMeld() {
        meld.displayMeld();
    }
}