package observerdesignpattern.observer;

import observerdesignpattern.observable.WhetherStationObservable;

public class MobileDisplay implements DisplayObserver{
    WhetherStationObservable whetherStation;
    public MobileDisplay(WhetherStationObservable whetherStation){
        this.whetherStation = whetherStation;
    };
    @Override
    public void update() {
        System.out.println("Updating in Mobile Display: " + this.whetherStation.getData());
    }
}
