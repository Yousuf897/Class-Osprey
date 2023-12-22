package tek.week_6.Lab_Session;

import java.util.Scanner;

public class Activity {

    // 1. Write a java program and collect user information for example firstName, lastName and etc.
    // 2. Collect information about the car as well for example numberOfDoors, companyName and etc.
    // 3. Declare three variables and then try to calculate the sum, multiplication, division and
    // subtraction.

    // Print the information as well in which you've collected
    // for example System.out.println( firstName );
    // System.out.println( companyName );
    // System.out.println( "The sum of " X " + " Y " + " z + " = " result );

    public static void main(String[] args) {

        // 1. User Information

        System.out.println(" * * * * *  Employee Information * * * * * ");

        // First copy of the Employee class!

        Employee empObj = new Employee();

        empObj.collectEmployeeInformation();
        empObj.printEmployeeInformation();

        // Second copy of the Employee Class!

/*        Employee empTwoObj = new Employee();
        empTwoObj.collectEmployeeInformation();
        empTwoObj.printEmployeeInformation();*/

        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * * ");

        // 2. Vehicle Information

        System.out.println(" * * * * *  Vehicle Information * * * * * ");

        Vehicle vehObj = new Vehicle();

        vehObj.collectVehicleInformation();
        vehObj.printVehicleInformation();

        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * * ");

        // 3. Simple calculator that accepts three values

        System.out.println(" * * * * *  Simple Calculator  * * * * * ");

        int numberOne = 20;
        int numberTwo = 10;
        int numberThree = 5;

        int sumResult = numberOne + numberTwo + numberThree;
        int multResult = numberOne * numberTwo * numberThree;
        int divResult = numberOne / numberTwo / numberThree;
        int subResult = numberOne - numberTwo - numberThree;

        System.out.println("Addition Result: " + sumResult);
        System.out.println("Multiplication Result: " + multResult);
        System.out.println("Subtraction Result: " + subResult);
        System.out.println("Division Result: " + divResult);


        System.out.println(" * * * * *  * * * * *  * * * * *  * * * * * ");

    }

}
