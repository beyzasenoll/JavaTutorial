package HackerRank.StringTokens;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
    s = s.trim();

        if (s.length() == 0) {
            System.out.println(0);
            System.exit(0);
}
        String result[] = s.split("[!,?._'@ ]+");
        System.out.println(result.length);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
    }
        

        scan.close();
    }
}
