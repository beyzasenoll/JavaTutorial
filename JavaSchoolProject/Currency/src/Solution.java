import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int count = 0;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < a.length(); j++) {
                    if (a.charAt(i) == b.charAt(j) || a.charAt(i) == b.charAt(j) + 32 || a.charAt(i) == b.charAt(j) - 32) {
                        count++;
                    }
                }
                if (count == a.length()) {
                    System.out.println("Anagrams");
                    return true;
                } else {
                    System.out.println("Not Anagrams");
                    return false;
                }

            }

        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
