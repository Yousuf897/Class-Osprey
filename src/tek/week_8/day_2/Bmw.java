package tek.week_8.day_2;

public class Bmw extends Vehicle {

    String ownerName;
    String headLightModel;

    public Bmw(int numberOfDoors, String companyName, String color, String make, String model, String transmission_type, String ownerName, String headLightModel) {
         super( numberOfDoors, companyName, color, make, model, transmission_type);
         this.ownerName = ownerName;
         this.headLightModel = headLightModel;
    }

    void printBMWDetails() {
        System.out.println("number of doors: " + numberOfDoors);
        System.out.println("companyName: " + companyName);
        System.out.println("color: " + color);
        System.out.println("make: " + make);
        System.out.println("model " + model);
        System.out.println("transmission_type: " + transmission_type);
        System.out.println("owner Name: " + ownerName);
        System.out.println("headLightModel: " + headLightModel);
    }
}
