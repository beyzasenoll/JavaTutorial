import java.util.Random;

public class DustBin {
    private double capacity = 500;
    private boolean lid;
    private double currentGarbageAmount=0;
    private int score=0;

    public boolean openLid() {
        lid = true;
        return true;
    }

    public boolean closeLid() {
        lid = false;
        return true;
    }

    public void empty() {

        currentGarbageAmount = 0;
    }
    public int basketBin(){
        Random rand = new Random();
        int rand_int2= rand.nextInt(100)+1;
        if (rand_int2 >= 50) {
            System.out.println("You hit");
            Random rand2 = new Random();
            int trash= rand.nextInt(100)+1;
            putTrash(trash);
            score++;
            return score;
        }
        System.out.println("You missed");
       return score;
    }
    public boolean putTrash(double trash) {
        if (lid == true) {
            if (currentGarbageAmount + trash <= capacity) {
                currentGarbageAmount += trash;
                return true;
            } else {
                System.out.println("The dustbin is completely full, please empty the dustbin.");
                return false;
            }
        }
        return false;
    }
}
