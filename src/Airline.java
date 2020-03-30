import java.util.LinkedList;

public class Airline {
    private String name;
    private LinkedList<Flight> flights = new LinkedList<>();

    public Airline(String name) {
        this.name = name;
        System.out.println("Airline " + name + " created");
    }

    public void addFlights(Flight f) {
        flights.add(f);
    }
}
