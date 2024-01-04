package tek.week_7.day_2;

import java.util.Scanner;

public class AnimalRunner {
    public static void main(String[] args) {

        // Animal Objects
        Animal animalObj = new Animal();

        // Mobile Objects
        MobilePhone mobileOneObj = new MobilePhone();

        // Vehicle Objects
        Vehicle vehicleOneObj = new Vehicle();
        Vehicle vehicleTwoObj = new Vehicle();

        // Initializing some values to animal object and then printing the details
        animalObj.setAnimalName("Husky");
        animalObj.setAnimalAge(4);
        animalObj.animalWeight = 10.5;
        animalObj.animalColor = "Black & White";

        System.out.println( animalObj.getAnimalName() );

        animalObj.printAnimalInformation();

        animalObj.

        mobileOneObj.brand = "Apple";
        mobileOneObj.screenSize = 5.7;
        mobileOneObj.mobileModel = "10 pro";
        mobileOneObj.mobileColor = "Blue";

        System.out.println( mobileOneObj.mobileColor );

        mobileOneObj.printMobileInformation();

        vehicleOneObj.companyName = "BMW";
        vehicleOneObj.mileage = 12_000.0;
        vehicleOneObj.year = 2024;
        vehicleOneObj.vehicleModel = "X7";
        vehicleOneObj.printVehicleInformation();

        vehicleTwoObj.companyName = "Toyota";
        vehicleTwoObj.mileage = 15_000.0;
        vehicleTwoObj.year = 2023;
        vehicleTwoObj.vehicleModel = "Camry";
        vehicleTwoObj.printVehicleInformation();

    }
}
