package org.example;
public class ElectricCar extends ACar
{
    private int batteryCapacity;
    private int maxRange;


    public ElectricCar (int batteryCapacity, int maxRange, String registrationNumber, String make, String model, int numberOfDoors) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    int getBatteryCapacityKWh() // returns the battery capacity in kilowatt-hours
    {
        return batteryCapacity;
    }
    int getMaxRangeKm() // returns the maximum range in kilometres
    {
        return maxRange;
    }

    double getWhPrKm() // returns the power consumption in watt-hours per driven kilometre
    {
        double wattHoursPrKm = (double) (batteryCapacity * 1000) / maxRange;
        return wattHoursPrKm;
    }

    @Override
    public int getRegistrationFee()
    {
        int registrationFee = 0;

        double wattHoursPrKmToKmPrLiter = getWhPrKm() / 91.25;
        double kmPrLitre = 100 / wattHoursPrKmToKmPrLiter;

        if(kmPrLitre <= 5)
        {
            registrationFee += 10470;
        }
        else if (kmPrLitre <= 10)
        {
            registrationFee += 5500;
        }
        else if (kmPrLitre <= 15)
        {
            registrationFee += 2340;
        }
        else if (kmPrLitre <= 20)
        {
            registrationFee += 1050;
        }
        else if (kmPrLitre > 20)
        {
            registrationFee += 330;
        }

        return registrationFee;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nBattery capacity: " + getBatteryCapacityKWh() + " kw" + "\nMax range : " + getMaxRangeKm() + " km" + "\nwatt-hours/km: " + getWhPrKm() + "\nRegistration nr: " + getRegistrationNumber() + "\nRegistration Fee: " + getRegistrationFee();
    }

}
