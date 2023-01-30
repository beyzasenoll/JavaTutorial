public class Circle {
    int x;
    int y;
    int d;
    double radius;

    public Circle(int x, int y, double radius){
        this.x=x;
        this.radius=radius;
        this.y=y;
    }


    public static boolean doesIntersect(Circle c1, Circle c2) {
        int d;
        double r1 = c1.radius;
        double r2 = c2.radius;

        d = ((c1.x - c2.x) ^ 2 + (c1.y - c2.y) ^ 2) ^ 1 / 2;

        if (r1 + r2 < d) {
            System.out.println("no intersection " +d);
            return false;
        } else if (Math.abs(r1 - r2)> d) {
            System.out.println("inside " +d);
            return false;
        } else if (d == 0) {
            System.out.println("They intersect infinite number of locations"+d);
        }
        return true;
    }
}