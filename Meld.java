import java.util.ArrayList;

public class Meld {
    private ArrayList<Dice> meldDice;

    public Meld() {
        meldDice = new ArrayList<>();
    }

    public void addDie(Dice die) {
        meldDice.add(die);
    }

    public void removeDie(int index) {
        if (index >= 0 && index < meldDice.size()){
            meldDice.remove(index);
        } else {
            System.out.println("Invalid meld index.");
        }
    }

    public int size(){
        return meldDice.size();
    }

    public void displayMeld() {
        if (meldDice.isEmpty()){
            System.out.println("Meld is empty");
            return;
        }

        for (int row = 0; row < 5; row++) {
            for (Dice die : meldDice) {
                System.out.print(die.getDiceArt()[row] + " ");
            }
            System.out.println();
        }

        char label = 'A';
        for (int i = 0; i < meldDice.size(); i++){
            System.out.println("    " + label + " ");
            label++;
        }
        System.out.println();
    }

    public ArrayList<Dice> getDice() {
        return meldDice;
    }
}