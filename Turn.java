public class Turn {
    private Hand hand;
    private int totalScore;
    private boolean turnActive;

    public Turn() {
        hand = new Hand();
        totalScore = 0;
        turnActive = true;

        hand.rollAllDice();
        System.out.println("Starting hand:");
        hand.displayUnusedDice();

        if (hand.isFarkle()){
            System.out.println("FARKLE! No scoring combos available.");
            System.out.println("Your turn ends with 0 points.");
            turnActive = false;
        }
    }

    public void run(){
        if (!turnActive) {
            return;
        }

        while (turnActive) {
            Menu.run(this, hand);
        }

        System.out.println("Turn comlete. Total score: " + totalScore);
    }

    public void bank() {
        int meldScore = Score.calculate(hand.getMeld());

        if (meldScore == 0) {
            System.out.println("Cannot bank — meld score is 0.");
            return;
        }

        totalScore += meldScore;
        System.out.println("Banked " + meldScore + " points!");
        turnActive = false;
    }

    public void reroll() {
    int meldScore = Score.calculate(hand.getMeld());

    if (meldScore == 0) {
        System.out.println("Cannot reroll — meld score is 0.");
        return;
    }

    if (hand.unusedSize() == 0) {
        System.out.println("HOT HAND! Rolling 6 new dice!");
        hand = new Hand();
        hand.rollAllDice();
    } else {
        System.out.println("Rerolling unused dice...");
        hand.rerollUnused();
    }

    hand.displayUnusedDice();

    if (hand.isFarkle()) {
        System.out.println("FARKLE! No scoring combos available.");
        System.out.println("Your turn ends with 0 points.");
        totalScore = 0;
        turnActive = false;
    }
}


}