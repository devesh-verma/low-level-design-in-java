package observerdesignpattern.observable;

import observerdesignpattern.observer.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class WhetherStation implements WhetherStationObservable{
    List<DisplayObserver> observerList;
    public WhetherStation(){
        this.observerList = new ArrayList<>();
    }
    public int temperature = 23;
    @Override
    public void add(DisplayObserver observer) {
        observerList.add(observer);
    }
    @Override
    public void remove(DisplayObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void nottify() {
        for (DisplayObserver observer: observerList) {
            observer.update();
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
