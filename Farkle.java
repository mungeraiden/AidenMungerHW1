public class Farkle {

    public static void main(String[] args) {
        Hand hand = new Hand();
        hand.rollAllDice();

        System.out.println("Starting Hand:");
        hand.displayUnusedDice();

        System.out.println("Thanks for playing Zag Farkle!");
    }
}