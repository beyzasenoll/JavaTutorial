public class Vegetarian extends Pizza{
    public Vegetarian() {
            super("Vegetarian Pizza", "It includes only vegetables");
            setCost(super.getCost()*1.1);
    }

}
