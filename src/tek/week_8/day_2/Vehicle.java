package tek.week_8.day_2;

public class Vehicle {

     int numberOfDoors;
     String companyName;
      String color;
     String make;
     String model;
     String transmission_type;

    public Vehicle(int numberOfDoors, String companyName, String color, String make, String model, String transmission_type) {
        this.numberOfDoors = numberOfDoors;
        this.companyName = companyName;
        this.color = color;
        this.make = make;
        this.model = model;
        this.transmission_type = transmission_type;
    }

    void startEngine() {
        System.out.println("Vehicle engine is started!");
    }

    void stopEngine() {
        System.out.println("Vehicle engine is stopped.");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numberOfDoors=" + numberOfDoors +
                ", companyName='" + companyName + '\'' +
                ", color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", transmission_type='" + transmission_type + '\'' +
                '}';
    }

    void printVehicle() {
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("company Name: " + companyName);
    }
}
