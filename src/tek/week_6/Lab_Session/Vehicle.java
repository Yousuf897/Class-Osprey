package tek.week_6.Lab_Session;

import java.util.Scanner;

public class Vehicle {

    // Attributes or Fields or Variables

    String companyName;
    String model;
    int year;
    int numberOfDoors;
    String color;
    double millage;
    double price;

    // Method to print the vehicle information

    void printVehicleInformation() {
        System.out.println("Company name: " + companyName);
        System.out.println("Vehicle Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Color: " + color);
        System.out.println("Millage: " + millage);
        System.out.println("Price: " + price);
    }

    void collectVehicleInformation() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the company name: ");
        companyName = input.next();

        System.out.print("Enter the vehicle model: ");
        model = input.next();

        System.out.print("Enter the year: ");
        year = input.nextInt();

        System.out.print("Enter the number of doors: ");
        numberOfDoors = input.nextInt();

        System.out.print("Enter the color of the vehicle: ");
        color = input.next();

        System.out.print("Enter the millage: ");
        millage = input.nextDouble();

        System.out.print("Enter the price of the vehicle: ");
        price = input.nextDouble();
    }

}
