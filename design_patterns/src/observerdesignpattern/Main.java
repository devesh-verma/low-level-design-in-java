package observerdesignpattern;

import observerdesignpattern.observable.WhetherStation;
import observerdesignpattern.observable.WhetherStationObservable;
import observerdesignpattern.observer.MobileDisplay;
import observerdesignpattern.observer.TvDisplay;

public class Main {
    public static void main(String[] args) {
        System.out.println("Observer Pattern");
        WhetherStationObservable whetherStation = new WhetherStation();
        MobileDisplay mobileDisplay = new MobileDisplay(whetherStation);
        TvDisplay tvDisplay = new TvDisplay(whetherStation);

        whetherStation.add(mobileDisplay);
        whetherStation.add(tvDisplay);

        whetherStation.setData(30);
    }
}
