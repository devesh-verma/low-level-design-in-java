package observerdesignpattern.observable;

import observerdesignpattern.observer.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class WhetherStation implements WhetherStationObservable{
    List<DisplayObserver> observers;
    public WhetherStation(){
        this.observers = new ArrayList<>();
    }
    int temperature = 23;
    @Override
    public void add(DisplayObserver obj) {
        observers.add(obj);
    }
    @Override
    public void remove(DisplayObserver obj) {
        observers.remove(obj);
    }

    @Override
    public void nottify() {
        for (DisplayObserver obj: observers) {
            obj.update();
        }
    }

    @Override
    public void setData(int newTemperature) {
        if(newTemperature > temperature){
            temperature = newTemperature;
            this.nottify();
        }
    }

    @Override
    public int getData() {
       return this.temperature;
    }
}
