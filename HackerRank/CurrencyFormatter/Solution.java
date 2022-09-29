import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String formattedFrance = france.format(payment);
        
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        String formattedUs = us.format(payment);
        
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String formattedChina = china.format(payment);
        
        NumberFormat india = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        String formattedIndia = india.format(payment);
        
        System.out.println("US: " + formattedUs);
        System.out.println("India: " + formattedIndia);
        System.out.println("China: " + formattedChina);
        System.out.println("France: " + formattedFrance);
    }
}
