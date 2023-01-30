package observer;

public class SmsObserver implements Observer{
    Subject s;
    public SmsObserver(Subject s){
        this.s=s;
        s.registerObserver(this);
    }

    @Override
    public void notify_() {
        System.out.println("ygfhkjıldşp");

    }

}

