package Models.Ticket;

import Models.Person.Passenger;

public class Ticket {

    private String seat;
    private String flightClass;
    private double cost;
    private Passenger passenger;

    public Ticket(String seat, String flightClass, double cost, Passenger passenger){
        this.seat = seat;
        this.flightClass = flightClass;
        this.cost = cost;
        this.passenger = passenger;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
