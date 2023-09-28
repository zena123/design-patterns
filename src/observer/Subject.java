package observer;

import java.util.ArrayList;
import java.util.List;

// observable
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){

    observers.add(0, observer);
    }
    public void removeObserver( Observer observer){
        observers.remove(observer)

    }

    public void notifyObservers(){
        for (var observer:observers){
            observer.update();
        }
    }
}
