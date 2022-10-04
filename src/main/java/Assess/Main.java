package Assess;

public class Main {
    public static void main(String[] args) {
        FlightCrewJob flightCrewJob1;
        FlightCrewJob flightCrewJob2;
        FlightCrewJob flightCrewJob3;

        CrewMember Pilot;
        CrewMember Co_Pilot;
        CrewMember Flight_Attendant;

        Ticket busTicket = new BusTicket(25,"Canada","Florida","Seat 22A",55.0);
        Ticket planeTicket = new PlaneTicket(12,"Africa","Detroit","Seat 35D",100.0);

        Passenger passenger57 = new Passenger("Felix",Ticket busTicket,1000.0);
    }
}
