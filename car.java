import java.util.ArrayList;

public class car {
    //fields
    private ArrayList<Passenger> people;
    private int destination;
    private int initialStation;
    private boolean forward;
    private int currentStation;
    private boolean moveable;
    private int revenue;
    private int distanceTraveled;


    //constructor

    public car(int myInitialStation, int myDestination) {
        initialStation = myInitialStation;
        destination = myDestination;
        Passenger = new ArrayList<>();
        currentStation = myInitialStation;
}
