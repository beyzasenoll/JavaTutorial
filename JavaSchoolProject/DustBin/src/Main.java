public class Main {
    public static void main(String[] args) {
        int score1 = 0;
        int score2=0;
        DustBin gamer1 = new DustBin();
        DustBin gamer2 = new DustBin();
        gamer1.openLid();
        System.out.println("---------------------------------------------------------------");
        System.out.println("gamer 1");
        System.out.println("---------------------------------------------------------------");
        score1 = getScore1(score1, gamer1);

        gamer2.openLid();
        System.out.println("---------------------------------------------------------------");
        System.out.println("gamer 2");
        System.out.println("---------------------------------------------------------------");
        for(int i=0;i<5;i++) {
            score2 = gamer2.basketBin();
            System.out.println(score2);
        }

        if (score1 > score2) {
            System.out.println("GAMER 1 WON");
        } else if (score1< score2) {
            System.out.println("GAMER 2 WON");
        } else {
           System.out.println("GAMER 1 SCORE EQUALS TO GAMER 2.");
        }
    }

    private static int getScore1(int score1, DustBin gamer1) {
        for(int i=0;i<5;i++) {
            score1 = gamer1.basketBin();
            System.out.println(score1);
        }
        return score1;
    }
}