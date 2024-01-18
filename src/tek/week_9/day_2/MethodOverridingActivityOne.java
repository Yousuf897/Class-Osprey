package tek.week_9.day_2;

public class MethodOverridingActivityOne {

    /*
    Vehicle Speed:

    1. Create a class Vehicle with a method speed() that prints "Vehicle runs".
    2. Create a class Bike that extends Vehicle. Override the speed() method to print "Bike can run at 100 mph".
    3. Create a class Car that extends Vehicle. Override the speed() method to print "Car can run at 150 mph".
    4. Test the speed of different vehicles.

    */

    public static void main(String[] args) {

        // Objects
        var vehicleObj = new Vehicle();
        var carObj = new Car();
        var bikeObj = new Bike();

        // Calling the method from different classes
        vehicleObj.speed();
        carObj.speed();
        bikeObj.speed();

    }


}
