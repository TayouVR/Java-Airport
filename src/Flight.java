import java.util.LinkedList;

public class Flight {
    private int flightNr;
    private int length;
    private LinkedList<Passengers> passangers = new LinkedList<>();
    private LinkedList<FlightAttendant> flightAttendees = new LinkedList<>();
    private Pilot pilot;
    private String start;
    private String to;

    public Flight(int flightNr, int length, Pilot p, String from, String to) {
        this.flightNr = flightNr;
        this.length = length;
        pilot = p;
        this.start = from;
        this.to = to;
        System.out.println("[" + flightNr + "] Flight from " + start + " to " + to + " (" + length + "km) with Pilot " + pilot.getName() + " created");
    }

    public void addPassenger(Passengers p) {
        passangers.add(p);
        System.out.println("[" + flightNr + "] Passenger " + p.getName() + " added to flight");
    }

    public void addFlightAttendees(FlightAttendant fa) {
        flightAttendees.add(fa);
        System.out.println("[" + flightNr + "] Flight Attendant " + fa.getName() + " added to flight");
    }

    public void printTravelData(Person p) {
        if (p instanceof Passengers) {
            Passengers passenger = (Passengers)p;
            System.out.println(passenger.getName() + ", " + passenger.getAge() + " is flying from " + start + " to " + to);
        } else if (p instanceof FlightAttendant) {
            FlightAttendant flightAttendant = (FlightAttendant)p;
            System.out.println(flightAttendant.getName() + ", " + flightAttendant.getAge() + " attends flight from " + start + " to " + to);
        }
    }

    public LinkedList getPassengers() {
        return passangers;
    }
    public LinkedList getFlightAttendees() {
        return flightAttendees;
    }

}
