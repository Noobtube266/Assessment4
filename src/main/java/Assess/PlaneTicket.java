package Assess;

public class PlaneTicket extends Ticket{
    public PlaneTicket(int id, String origin, String destination, String seatNumber, double price) {
        super(id, origin, destination, seatNumber, price);
    }
    boolean isFrequentFlyer;
}
