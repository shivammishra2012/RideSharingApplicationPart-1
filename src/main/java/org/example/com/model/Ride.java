package org.example.com.model;

public class Ride {

    private Rider rider;
    private Driver driver;
    private int origin;
    private int destination;
    private int seats;
    private static final double AMOUNT_PER_KM = 20.0;

    public Ride(Rider rider, Driver driver, int origin, int destination, int seats) {
        this.rider = rider;
        this.driver = driver;
        this.origin = origin;
        this.destination = destination;
        this.seats = seats;
    }

    public double calculateAmount() {
        int distance = destination - origin;
        double rate = (seats == 1) ? AMOUNT_PER_KM : AMOUNT_PER_KM * 0.75 * seats;
        if (rider instanceof PreferredRider) {
            rate = (seats == 1) ? AMOUNT_PER_KM * 0.75 : AMOUNT_PER_KM * 0.5 * seats;
        }
        return distance * rate;
    }

    public void closeRide() {
        double amount = calculateAmount();
        System.out.println("Ride Amount for " + rider.getName() + ": " + amount);
        rider.incrementRides();
        driver.setAvailable(true);
    }

}
