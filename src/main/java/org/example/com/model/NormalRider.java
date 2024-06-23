package org.example.com.model;

public class NormalRider implements Rider {
    private String name;
    private int totalRides;

    public NormalRider(String name) {
        this.name = name;
        this.totalRides = 0;
    }

    public String getName() {
        return name;
    }

    public int getTotalRides() {
        return totalRides;
    }

    public void incrementRides() {
        totalRides++;
    }
}
