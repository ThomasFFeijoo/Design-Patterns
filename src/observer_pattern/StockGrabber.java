package observer_pattern;

import java.util.ArrayList;

// Uses the Subject interface to update all Observers
public class StockGrabber implements Subject{


    private ArrayList<Observer> observers; // Arraylist to hold all observers
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        observers = new ArrayList<Observer>();
    }

    // Adds new observer to Arraylist
    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int observerIndex = observers.indexOf(o);

        System.out.println("Observer " + (observerIndex+1) + " deleted"); //Have to increment index to match

        observers.remove(observerIndex);
    }

    // notify all observers about price changes
    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }
}
