package org.example;

import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();

    void addCar(Car car){
        fleet.add(car);
    }

    int getTotalRegistrationFeeForFleet()
    {
        int totalRegFleet = 0;
        for (Car s : fleet) {
            totalRegFleet += s.getRegistrationFee();
        }
        return totalRegFleet;
    }

    @Override
    public String toString()
    {
        StringBuilder allCars = new StringBuilder();
        for (Car s : fleet){
         allCars.append(s);
        }
        return allCars.toString();
    }
}


