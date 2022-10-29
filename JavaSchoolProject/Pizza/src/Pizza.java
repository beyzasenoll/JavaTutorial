public class Pizza {

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    private double cost;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    private double size;

    private String name;
    private String desc;


    public Pizza(String name,
                    String desc) {
        this.name= name;
        this.desc= desc;
        this.cost=5.0;

    }

    public double cost() {

        return size*cost;
    }
    @Override
    public String toString() {

        return name + " "+getSize();
    }


}
