package org.example;
public class DieselCar extends AFuelCar
{

    private boolean particleFilter;

    public DieselCar(int kmPrLitre, boolean particleFilter, String registrationNumber, String make, String model, int numberOfDoors) {
        super(kmPrLitre, registrationNumber, make, model, numberOfDoors);
        this.particleFilter = particleFilter;
    }

    @Override
    String getFuelType()
    {
        return "Diesel ";
    }

    @Override
    public String getRegistrationNumber()
    {
        return registrationNumber;
    }

    @Override
    public int getRegistrationFee()
    {
        int registrationFee = 0;
        if(particleFilter == false){
            registrationFee = 1000;
        }

        if(getKmPrLitre() <= 5)
        {
            registrationFee += 10470 + 130;
        }
        else if (getKmPrLitre() <= 10)
        {
            registrationFee += 5500 + 1390;
        }
        else if (getKmPrLitre() <= 15)
        {
            registrationFee += 2340 + 1850;
        }
        else if (getKmPrLitre() <= 20)
        {
            registrationFee += 1050 + 2770;
        }
        else if (getKmPrLitre() <= 50)
        {
            registrationFee += 330 + 15260;
        }

        return registrationFee;
    }

    boolean hasParticleFilter()

    {
        return particleFilter;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nFuel: " +  getFuelType() + "\nRegistration nr: " + getRegistrationNumber() + "\nRegistration Fee: " + getRegistrationFee();
    }

}
