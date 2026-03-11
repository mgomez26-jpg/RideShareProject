public class Passenger {
 //fields
 private int location;
 private int destination;
 private boolean direction;
 private int ID;
 private static int globalID = 0;
 private int originalDestination;
 private int startStation;
 
 //constructor
 public Passenger (int startStation, int destination, int originalDestination){
    this.startStation = startStation;
    this.destination = destination;
    this.originalDestination = originalDestination;
    ID = globalID++;
 }

 public void setLocation (int location){
    this.location = location;
 }

 public int getLocation() {
    return location;
 }
 public int getStart() {
    return startStation;
 }
 
}
