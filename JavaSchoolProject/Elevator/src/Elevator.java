public class Elevator {
    double capacity;
    int maxFloor=50;
    int minFloor=0;
    int currentFloor;
   public enum states{
        BUSY,
        IDLE,
        OUTOFSERVICE,
        EMERGENCY,
        OVERWEIGHT;
    }
    public boolean openDoor(){
        return true;
    }
    public boolean closeDoor(){
        return true;
    }
    public boolean liftUp(){
        if(currentFloor>minFloor){
            currentFloor++;
            return true;
        }
        return false;
    }
    public boolean liftDown(){
        if (currentFloor<minFloor){
            currentFloor--;
            return true;
        }
        return false;
    }
    public boolean goFloor(int floorNumber){
        if((floorNumber > maxFloor) || (floorNumber < minFloor)){
           return false;
       }
        while(currentFloor != floorNumber){
            if(currentFloor<floorNumber){
                System.out.println("Yukarı çıkılıyor");
                liftUp();
            }
            else{
                System.out.println("Aşağı iniliyor");
                liftDown();
            }
        }
        return true;
    }

}
