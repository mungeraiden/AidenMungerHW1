public class Dice {
    private int value = 1;

    private static final String[][] diceArt = {
      {
        "+-------+",
        "|       |",
        "|   o   |",
        "|       |",
        "+-------+",
      },
      {
        "+-------+",
        "| o     |",
        "|       |",
        "|     o |",
        "+-------+",
      },
      {
        "+-------+",
        "| o     |",
        "|   o   |",
        "|     o |",
        "+-------+",
      },
      {
        "+-------+",
        "| o   o |",
        "|       |",
        "| o   o |",
        "+-------+",
      },
      {
        "+-------+",
        "| o   o |",
        "|   o   |",
        "| o   o |",
        "+-------+",
      },
      {
        "+-------+",
        "| o   o |",
        "| o   o |",
        "| o   o |",
        "+-------+",
      }
    };

    public int getValue() {
        return value;
    }

    public void roll() {
        this.value = (int) (Math.random() * 6) + 1;
    }

    public String toString() {
        return "Dice value: " + value;
    }

    public static void display_dice(Dice dice) {
        int value = dice.getValue();
        for (String row : diceArt[value - 1]) {
            System.out.println(row);
        }
    }

    public String[] getDiceArt() {
        return diceArt[value - 1];
    }
}