public class Lahmacun extends Pizza{
    public Lahmacun() {
        super("Lahmacun", "Turkish pizza.");
        setCost(super.getCost()*2);
    }
}
