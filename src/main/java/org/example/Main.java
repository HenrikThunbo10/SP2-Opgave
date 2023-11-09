package org.example;
public class main {
    public static void main(String[] args) {

        // FleetOfCars fleet = new FleetOfCars();

        GasolineCar gasCar = new GasolineCar( 15, "AK273012 ", "Ford ", "Fiesta ", 4);
        System.out.println(gasCar);

        DieselCar diCar = new DieselCar(25, true, "EK847562 ", "Peugeot ", "3 ", 4);
        System.out.println(diCar);

        ElectricCar elCar = new ElectricCar(100, 400, "CV985045 ", "Tesla ", "T1 ", 4);
        System.out.println(elCar);

        FleetOfCars fleet = new FleetOfCars();
        fleet.addCar(gasCar);
        fleet.addCar(diCar);
        fleet.addCar(elCar);

        System.out.println(fleet.getTotalRegistrationFeeForFleet());
        System.out.println(fleet.fleet);

    }
}
