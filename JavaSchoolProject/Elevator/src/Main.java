public class Main {
    public static void main(String[] args) {
        Elevator elevator=new Elevator();
        elevator.openDoor();
        elevator.currentFloor=3;
        elevator.goFloor(8);
    }
}