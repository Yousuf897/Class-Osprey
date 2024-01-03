package tek.week_7.day_1;

public class Vehicle {

/*   Create a class called Vehicle.
     Store some information of vehicle for example: companyName, model, year ... etc.
     Create a method printVehicleDetails() that is going to print the details of the Vehicle

     Create a VehicleRunner class
     Create your main method
     Create an object of Vehicle class.
     Initialize some values to the fields in which you've created.
     Call printVehicleDetails() to see the details of the vehicle!

*/

    String companyName;
    String VehicleModel;
    int year;

    void printVehicleDetails() {
        System.out.println("Vehicle Company: " + companyName );
        System.out.println("Vehicle Model: " + VehicleModel );
        System.out.println("Vehicle Year: " + year );
    }


}
