public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle(2,5, 5.38);
        Circle circle2 = new Circle(1, 9,9.05);

        Circle.doesIntersect(circle1, circle2);

    }


}