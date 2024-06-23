package org.example.com.services;

import org.example.com.model.Driver;
import org.example.com.model.NormalRider;
import org.example.com.model.Ride;
import org.example.com.model.Rider;

import java.util.List;
import java.util.Map;

public class RideSharingService {

    private List<Driver> drivers;
    private Map<String, Rider> riders;

    public void addDriver(String  name ){
        drivers.add(new Driver(name));
    }
    public void addRider(String name ){
        riders.put(name ,  new NormalRider(name));
    }
    public void requestRide(String riderName, int origin, int destination, int seats){
      // first check the riderName is empty ot not


    }



}
