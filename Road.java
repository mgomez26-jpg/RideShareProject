import java.util.ArrayList;
import java.util.Random;

public class Road {
    private int miles;
    private int revenue;
    private ArrayList<Station> stations;
    private ArrayList<Car> cars;
    private Random random;

public void addStations() {
    this.stations = new ArrayList<>();
    for (int i = 0; i < 32; i++) {
        stations.add(new Station(i));
    }

}

public Road() {
    cars = new ArrayList<>();
    random = new Random();
}

public void addCars(int numCars) {
    for (int i = 0; i< numCars; i++) {
        stations.add(new Station(i));
    }
}

public Road() {
    cars = new ArrayList<>();
    random = new Random();
}

public void addCars(int numCars) {
    for (int i = 0; i < numCars; i++) {
        int start = random.nextInt(32);
        int dest - random.nextInt(32);

        while (dest == start) {
            dest = random.nextInt(32);
        }
        cars.add(new Car(start, dest));
    }
}

public void addPassengers(int numPassengers) {
    for (int i = 0; i < numPassengers; i++) {

        int start = random.nextInt(32);
        int dest = random.nextInt(32);

        while (dest == start) {
            dest = random.nextInt(32);
        }
        









