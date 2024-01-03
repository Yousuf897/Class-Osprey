package tek.week_7.day_1;

public class Employee {

    public static void main(String[] args) {

/*        String firstEmployeeName = "Alex";
        String firstEmployeeLastName = "Alexander";

        System.out.println( "First Employee First Name: " + firstEmployeeName );
        System.out.println( "First Employee Last Name: " + firstEmployeeLastName );

        String secondEmployeeFirstName = "Bob";
        String secondEmployeeLastName = "BobLast Name";

        System.out.println( "First Employee First Name: " + secondEmployeeFirstName );
        System.out.println( "First Employee Last Name: " + secondEmployeeLastName );

        String thirdEmployeeFirstName = "Alixie";
        String thirdEmployeeLastName = "Hardin";

        System.out.println( "First Employee First Name: " + thirdEmployeeFirstName );
        System.out.println( "First Employee Last Name: " + thirdEmployeeLastName );*/

        EmployeeInformation empOneObj = new EmployeeInformation();
        EmployeeInformation empTwoObj = new EmployeeInformation();
        EmployeeInformation empThreeObj = new EmployeeInformation();

        // First Employee
        empOneObj.firstName = "Alex";
        empOneObj.lastName = "Alexander";
        empOneObj.printEmployeeDetails();
        empOneObj.printHelloWithUserName( "Naser" );

        // Second Employee
        empTwoObj.firstName = "Bob";
        empTwoObj.lastName = "BobLast Name";
        empTwoObj.printEmployeeDetails();

        // Third Employee
        empThreeObj.firstName = "Alixie";
        empThreeObj.lastName = "Hardin";
        empThreeObj.printEmployeeDetails();

    }

}
