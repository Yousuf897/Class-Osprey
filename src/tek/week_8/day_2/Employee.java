package tek.week_8.day_2;

public class Employee {

    String firstName;
    String lastName;

    void printEmployeeInformation() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
