public class MarbleJar {
    private double capacity;
    private boolean lid;
    private int currenMarbleAMount;

    public MarbleJar(double capacity) {
        this.capacity = capacity;
    }



    public boolean openLid()
    {
        lid= true;
        return true;
    }

    public boolean closeLid()
    {
        lid= false;
        return true;
    }

    public boolean putMarble (int Marble)
    {
        if(lid==true) {
            if(Marble<=(capacity-currenMarbleAMount)) {
                currenMarbleAMount+=Marble;
                System.out.println("current marble amount is " +currenMarbleAMount);
                return true;
            }
        }
        System.out.println("Capacity overloaded.");
        return false;
    }

    public boolean takeMarble (int Marble)
    {
        if(lid==true) {
            if(currenMarbleAMount!=0) {
                if(Marble<= currenMarbleAMount) {
                    currenMarbleAMount-= Marble;
                    System.out.println("current marble amount is "+ currenMarbleAMount);
                    return true;
                }

            }
        }
        return false;

    }


}
