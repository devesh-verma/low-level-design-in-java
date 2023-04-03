package observerdesignpattern.observer;

import observerdesignpattern.observable.WhetherStationObservable;

public class TvDisplay implements DisplayObserver{
    WhetherStationObservable whetherStation;
    // Constructor injection
    public TvDisplay(WhetherStationObservable whetherStation){
        this.whetherStation = whetherStation;
    }
    @Override
    public void update() {
        // business logic to update display
        System.out.println("Updating in TV Display: " + this.whetherStation.getData());
    }
}
