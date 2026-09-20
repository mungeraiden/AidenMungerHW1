public class Dice {
    private int value = 1;

    public int getValue() {
        return value;
    }

    public void roll() {
        this.value = (int) (Math.random() * 6) + 1;
    }

    public String toString() {
        return "Dice value: " + value;
    }
}