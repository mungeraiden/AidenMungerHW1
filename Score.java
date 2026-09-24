import java.util.ArrayList;

public class Score{
    
    public static int calculate(Meld meld) {
        ArrayList<Dice> dice = meld.getDice();

        if (dice.isEmpty()){
            return 0;
        }

        int[] counts = new int[7];
        for (Dice d : dice) {
            counts[d.getValue()]++;
        }

        int score = 0;


        // Straight
        boolean isStraight = true;
        for (int i = 1; i <= 6; i++){
            if (counts[i] != 1){
                isStraight = false;
                break;
            }
        }

        if (isStraight){
            return 1000;
        }

        // Three pairs
        int pairCount = 0;
        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 2){
                pairCount++;
            }
        }
        if (pairCount == 3){
            return 750;
        }

        // Triples or more
        for (int face = 1; face <= 6; face++){
            int count = counts[face];

            if (count >= 3){
                if (face == 1){
                    score += 1000;
                }

                score += (count - 3) * 100;
            } else {
                score += face * 100;

                score += (count - 3) * (face * 100);
            }
        }

        // Single 1s
        if (counts[1] < 3) {
            score += counts[1] * 100;
        }

        if (counts[5] < 3){
            score += counts[5] * 50;
        }

        return score;
    }
}