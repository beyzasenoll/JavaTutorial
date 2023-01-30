package observer;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> listOfObserver = new ArrayList<>();
    public  void StateChange(){
        notifyObservers();
    }
    public void notifyObservers(){
        for(Observer o:listOfObserver){
            o.notify_();
        }
    }
    public void registerObserver(Observer o){
        listOfObserver.add(o);
    }
    public void unregisterObserver(Observer o){
        listOfObserver.remove(o);
    }

}
