
package dart;
import java.util.*;

public class DartPlayer {
    private int score;
    public final int numberOfThrow = 10;
    private String name;
    public int experience;

    public int playGame() {
        score = 0;
        for (int i = 1; i <= numberOfThrow; i++) {
            score += throwDart();
            System.out.println("score is "+score);
        }
        System.out.println("score is "+score);
        return score;
    }

    public int throwDart() {
        Random rand = new Random();

        //System.out.println("choosen score is "+ rand_int2);
        int rand_int2= rand.nextInt(100)+1;
        if (rand_int2 > 50) {
           System.out.println("hit");
            int rand_int1 = rand.nextInt(100)+1;
            if (rand_int1 < 50 && rand_int1 > 0) {
                return 5;
            } else if (rand_int1 >= 50 && rand_int1 < 85) {
                return 10;
            } else if (rand_int1 >= 85 && rand_int1 <= 100) {
                return 15;
            }
        }
        System.out.println("miss");
        return 0;
    }

}


