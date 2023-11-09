package org.example;
public class GasolineCar extends AFuelCar
{

    public GasolineCar(int kmPrLitre, String registrationNumber, String make, String model, int numberOfDoors) {
        super(kmPrLitre, registrationNumber, make, model, numberOfDoors);
    }

    @Override
    String getFuelType()
    {
        return "Benzin ";
    }

    @Override
    public int getRegistrationFee() {

        int registrationFee = 0;
        if(getKmPrLitre() <= 5)
        {
            registrationFee += 10470;
        }
        else if (getKmPrLitre() <= 10)
        {
            registrationFee += 5500;
        }
        else if (getKmPrLitre() <= 15)
        {
            registrationFee += 2340;
        }
        else if (getKmPrLitre() <= 20)
        {
            registrationFee += 1050;
        }
        else if (getKmPrLitre() <= 50)
        {
            registrationFee += 330;
        }

        return registrationFee;
    }

    @Override
    public String toString()

    {
        return super.toString() + "\nFuel: " + getFuelType() + "\nRegistration nr: " + getRegistrationNumber() + "\nRegistration Fee: " + getRegistrationFee();
    }
}
