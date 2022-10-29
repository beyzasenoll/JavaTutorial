import java.util.Objects;
import java.util.Scanner;

public class Waiter {
    public static void main(String[] args) {


        Pizza[] orders = new Pizza[50];
        Vegetarian a1 = new Vegetarian();
        a1.setSize(1);
        orders[0] = a1;
        Margaritta a2 = new Margaritta();
        a2.setSize(2);
        orders[1] = a2;
        Lahmacun a3 = new Lahmacun();
        a3.setSize(3);
        orders[2] = a3;
        System.out.println("TOTAL COST " + calculateCost(orders));
    }

//        cost += orders[0].cost();
//        System.out.println(cost);

    public static double calculateCost(Pizza[] order) {
        double cost = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println(order[i]);
            cost += order[i].getCost();
        }
        return cost;
    }
}