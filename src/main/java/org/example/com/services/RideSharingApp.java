package org.example.com.services;

import org.example.com.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RideSharingApp {
    private List<Driver> drivers;
    private Map<String, Rider> riders;

    public RideSharingApp() {
        drivers = new ArrayList<>();
        riders = new HashMap<>();
    }

    public synchronized void addDriver(String name) {
        drivers.add(new Driver(name));
    }

    public synchronized void addRider(String name) {
        riders.put(name, new NormalRider(name));
    }

    public synchronized Driver findAvailableDriver() {
        for (Driver driver : drivers) {
            if (driver.isAvailable()) {
                driver.setAvailable(false);
                return driver;
            }
        }
        return null;
    }

    public void requestRide(String riderName, int origin, int destination, int seats) {
        Rider rider = riders.get(riderName);
        if (rider == null) {
            System.out.println("Rider not found: " + riderName);
            return;
        }

        if (rider.getTotalRides() > 0 && !(rider instanceof PreferredRider)) {
            rider = new PreferredRider(riderName);
            riders.put(riderName, rider);
        }

        Driver driver = findAvailableDriver();
        if (driver == null) {
            System.out.println("No available drivers for rider: " + riderName);
            return;
        }

        Ride ride = new Ride(rider, driver, origin, destination, seats);
        ride.closeRide();
    }

}




