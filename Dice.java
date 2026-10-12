public class Dice {
    private int value = 1;

    public Dice(int value) {
        if (value < 1 || value > 6) {
            throw new IllegalArgumentException("Dice value must be between 1 and 6.");
        }
        this.value = value;
    }

    public Dice() {
      
    }

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