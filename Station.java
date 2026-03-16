import java.util.ArrayList;

public class Station {
    
private int id;
private ArrayList<Passenger> passengers;

    public Station(int id) {
        this.id = id;
        passengers = new ArrayList<>();
    }

    public int getStationNumber() {
        return id;
    }
    public ArrayList<Passenger> getPeople() {
        return passengers;
    }
     public void addPassenger(Passenger p) {
        passengers.add(p);
    }


