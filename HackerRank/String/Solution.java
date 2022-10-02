import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        char charA=A.charAt(0);
        int asciiA= (int) charA ;
        
        char charB=B.charAt(0);
        int asciiB=(int) charB;
        
        int sum=A.length()+B.length();
        System.out.println(sum);
        
        if ((asciiA<90 && asciiA>65) && (asciiB<90 && asciiB>65)){
            if(asciiA>asciiB){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        if ((asciiA<122 && asciiA>97) && (asciiB<122 && asciiB>97)){
            if(asciiA>asciiB){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        String upperA=A.substring(0,1).toUpperCase()+A.substring(1,A.length());
        String upperB=B.substring(0,1).toUpperCase()+B.substring(1);
        
        System.out.println(upperA+" "+ upperB);
               
    }
}



