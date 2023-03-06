package observerdesignpattern.observable;

import observerdesignpattern.observer.DisplayObserver;

public interface WhetherStationObservable {
    public void add(DisplayObserver obj);
    public void remove(DisplayObserver obj);
    public void nottify();
    public void setData(int temperature);
    public int getData();
}
