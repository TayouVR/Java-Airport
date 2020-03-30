/* Airport project by M. Sanz, do not distribute.
* License CC-BY-NC-ND 4.0 */

import java.util.LinkedList;

public class Airport {
    private String name;
    private LinkedList<Airline> airlines = new LinkedList<>();

    public Airport(String name) {
        this.name = name;
        System.out.println("Airport " + name + " created");
    }

    public void addAirlines(Airline a) {
        airlines.add(a);
    }

    public static void main(String[] args) {
        Airport f = new Airport("BER");
        Airline airline = new Airline("Cheapo Air");

        f.addAirlines(airline);

        Flight flight = new Flight(1,200, new Pilot("Hans",28,"Berlin"), "Berlin", "Amsterdam");

        airline.addFlights(flight);

        flight.addPassenger(new Passengers("Kandy Sandos",18,"Köln"));
        flight.addPassenger(new Passengers("Dusti Freyermuth",20,"Hull"));
        flight.addPassenger(new Passengers("Tynisha Fluck",26,"Berlin"));
        flight.addPassenger(new Passengers("Jan Charnoski",29,"Amsterdam"));
        flight.addPassenger(new Passengers("Francoise Pritchet",22,"München"));

        flight.addFlightAttendees(new FlightAttendant("Daniela",20,"Köln"));

        System.out.println();
        Flight flight2 = new Flight(2,250, new Pilot("Georg",31,"Köln"), "Berlin", "London");

        airline.addFlights(flight2);

        flight2.addPassenger(new Passengers("Kandy Sandos",18,"Köln"));
        flight2.addPassenger(new Passengers("Dusti Freyermuth",20,"Hull"));
        flight2.addPassenger(new Passengers("Tynisha Fluck",26,"Berlin"));
        flight2.addPassenger(new Passengers("Jan Charnoski",29,"Amsterdam"));
        flight2.addPassenger(new Passengers("Francoise Pritchet",22,"München"));

        flight2.addFlightAttendees(new FlightAttendant("Daniela",20,"Köln"));

        System.out.println();
        flight.printTravelData((Person) flight.getPassengers().get(2));
        flight.printTravelData((Person) flight.getPassengers().get(3));
        flight.printTravelData((Person) flight.getFlightAttendees().get(0));

        flight2.printTravelData((Person) flight2.getPassengers().get(0));
    }
}
