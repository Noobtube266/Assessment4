package Assess;

import static Assess.FlightCrewJob.*;

public class Main {
    public static void main(String[] args) {
        FlightCrewJob flightCrewJob1;
        FlightCrewJob flightCrewJob2;
        FlightCrewJob flightCrewJob3;

        CrewMember crewMember1 = new CrewMember("Jeremy Flier", 100000.0f,Pilot);
        CrewMember crewMember2 = new CrewMember("Danny Backer",90000.0f,Co_Pilot);
        CrewMember crewMember3 = new CrewMember("Jessica Walts",70000.0f,Flight_Attendant);

        Ticket busTicket = new BusTicket(4,"Canada","Florida","Seat 22A",55.0);
        Ticket planeTicket = new PlaneTicket(9,"Africa","Detroit","Seat 35D",100.0);

        Passenger passenger57 = new Passenger("Felix Wright",busTicket,1000.0,);
        Passenger passenger07 = new Passenger("Becky Moneys",planeTicket,800.0,);

    }
}
