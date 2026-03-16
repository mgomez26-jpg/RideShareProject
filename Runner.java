public class Runner {
    public static void main(String[] args) {
        Road road = new Road();
        road.addStations();
        road.addCars(20);
        road.addPassengers(50);

        System.out.println("Cars: " + road.getCars());
        System.out.println("Stations: " + road.getStations());

    }
}
