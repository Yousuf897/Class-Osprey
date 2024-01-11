package tek.week_8.day_3;

import java.util.Scanner;

public class Staff {

    String name;
    String designation;

    void displayDetails() {
        System.out.println("Name: " + name );
        System.out.println("Designation: " + designation );
    }

    void captureStaffInformation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter designation: ");
        designation = input.nextLine();
    }
}
