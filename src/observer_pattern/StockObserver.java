package observer_pattern;

// Represents each Observer that is monitoring changes in the subject
public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0; // used as a counter

    private int observerID;

    private Subject stockGrabber; // Will hold reference to the StockGrabber object

    public StockObserver(Subject stockGrabber) {
        // Store the reference to the stockGrabber object so I can make calls to its methods
        this.stockGrabber = stockGrabber;

        this.observerID = ++observerIDTracker;
        System.out.println("New Observer: " + this.observerID);

        // Add the observer to the Subjects ArrayList
        this.stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        this.printThePrices();
    }

    private void printThePrices() {
        System.out.println(observerID + "\nIBM: " + ibmPrice +
                "\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice + "\n");
    }
}
