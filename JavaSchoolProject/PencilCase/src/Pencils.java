import java.util.Random;

public class Pencils {
    public Pencils(double capacity) {
        this.capacity = capacity;
    }

    private double capacity;
    private boolean lid;
    private double currentPencilAmount;

    public boolean openLid() {
        lid = true;
        return true;
    }

    public boolean closeLid() {
        lid = false;
        return true;
    }

    public boolean addPencil(int pencil) {
        if (lid == true) {
            if (currentPencilAmount + pencil <= capacity) {
                currentPencilAmount += pencil;
                System.out.println("pencil added,current pencil amount is "+currentPencilAmount );
                return true;
            } else {
                System.out.println("The pencil case is completely full");
                return false;
            }
        }
        return false;
    }

    public boolean removePencil(int pencil){
        if(lid==true){
            if(currentPencilAmount >= pencil){
                currentPencilAmount -= pencil;
                System.out.println("pencil(s) removed,current pencil amount is "+currentPencilAmount);
                return true;
            }
            else{
                System.out.println("There are not enough pencils.");
                return false;
            }
        }
        return false;
    }
}

