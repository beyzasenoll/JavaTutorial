public class Main {
    public static void main(String[] args) {
        Factorial f=new Factorial();
        int i,fact=1;
        int number=4;//It is the number to calculate factorial
        fact = f.fact(number);
        System.out.println("Factorial of "+number+" is: "+fact);

        String str="beyza";
        WriteBackward a=new WriteBackward();
        a.reverseString(str);
    }
}