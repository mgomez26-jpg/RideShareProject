import java.util.ArrayList;

public class Car {
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

    public Car(int myInitialStation, int myDestination) {
        initialStation = myInitialStation;
        destination = myDestination;
        Passenger = new ArrayList<>();
        currentStation = myInitialStation;
}

    // determine direction based on initial and destination stations
    forward = initialStation < destination;

    //initialize movability as true
    moveable = status;
}

public Passenger dropoff(int pos) {
    if (pos != -1) {
        Passenger temp = people.get(pos);
        people.remove(pos);
        return temp;
    }
    
    return null;
}

public void remove(Passenger p) {
    if (people.size() <= 3) {
        people.add(p);
    }
}

//Getter methods
public int getInitialStation(){
    return initialStation;
}

public boolean getMoveable() {
    return moveable;
}
public boolean isAtDestination() {
    return currentStation == destination;
}

public ArrayList<Passenger> getPeople() {
    return people;
}
public int getStationNumber() {
    return currentStation;
}

