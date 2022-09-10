package HackerRank.StaticInitilizerBlok;
import java.util.*;

public class Solution {
    static int B;
    static int H;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();

        try {
            if (B > 0 && H > 0) {
                System.out.println(B * H);
            } else {
                sc.close();
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}
