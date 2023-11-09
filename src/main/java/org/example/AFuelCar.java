package org.example;
abstract class AFuelCar extends ACar {

    private int kmPrLitre;

    public AFuelCar (int kmPrLitre, String registrationNumber, String make, String model, int numberOfDoors)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;

    }

    abstract String getFuelType(); // should return "Gasoline" or "Diesel"


    int getKmPrLitre() // should return how many kilometres the car can drive on 1 litre of fuel
    {
        return kmPrLitre ;
    }

    @Override
    public String toString()

    {
        return super.toString() + "\nkm/lt: " + getKmPrLitre();
    }
}
