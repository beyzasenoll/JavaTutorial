package HackerRank.Anagrams;

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
  boolean returnValue=true;
  b=b.toLowerCase();
  a=a.toLowerCase();
    if(b.length()==a.length()){
        for(int i=0;i<a.length();i++){
      
            String c=a.substring(i,i+1);
            if(b.contains(c)){
  
               b=b.replaceFirst(c,"*");
               returnValue=true;
           }
           else{
               returnValue=false;
               break;
           }

        }
    return returnValue;
    }
return false; 
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

