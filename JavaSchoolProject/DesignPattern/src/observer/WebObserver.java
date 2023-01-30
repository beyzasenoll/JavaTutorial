package observer;

public class WebObserver implements Observer {
    Subject s;
    public WebObserver(Subject s){
        this.s=s;
        s.registerObserver(this);
    }

    @Override
    public void notify_() {
        System.out.println("cvbn");

    }
}
