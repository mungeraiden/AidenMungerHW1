public class Farkle {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            Dice dice = new Dice();
            dice.roll();
            Dice.display_dice(dice);
        }
    }
}
