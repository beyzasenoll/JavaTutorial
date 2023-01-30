package observer;

public class Marriage{
    public static void main(String[] args) {

        Subject s1=new MyHusband();
        Subject s2=new MyWife();

        Observer ob1=new SmsObserver(s1);
        Observer ob2=new SmsObserver(s2);
        Observer wobs1=new WebObserver(s1);
        Observer wobs2=new WebObserver(s2);

         ((MyHusband) s1).Hurt();//casting?


    }
}