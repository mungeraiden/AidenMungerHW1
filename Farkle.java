public class Farkle {
    
    public static void main(String[] args) {
        Hand hand = new Hand();

        System.out.println("Starting Hand: ");
        hand.rollAllDice();
        hand.displayUnusedDice();

        System.out.println("");
        System.out.println("Moving die A to meld...");
        hand.addToMeld(0);

        hand.displayMeld();
    }

}