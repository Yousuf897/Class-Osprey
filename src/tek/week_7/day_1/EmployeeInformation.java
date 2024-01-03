package tek.week_7.day_1;

public class EmployeeInformation {

    String firstName;
    String lastName;

    void printEmployeeDetails() {
        System.out.println( "Employee First Name: " + firstName );
        System.out.println( "Employee Last Name: " + lastName );
    }

    // I need to pass a value to this method, and this method needs to print my name along with Hello and welcome + NAME

    void printHelloWithUserName( String name ) {
        System.out.println( "Hello and Welcome " + name );
    }

}
