import java.util.*;
class Box implements Comparable<Box>{
    int length, breadth, height, area;
    public Box(int x, int y, int z){
        length = x;
        breadth = y;
        height = z;
        area = length*breadth;
    }

    public int compareTo(Box b){
        // to sort in increasing order
        return this.area - b.area;
    }
}