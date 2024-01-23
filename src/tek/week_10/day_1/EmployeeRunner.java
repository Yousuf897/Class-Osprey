package tek.week_10.day_1;

public class EmployeeRunner {


    public static void main(String[] args) {

        var employeeOne = new Employee();
        employeeOne.setFirstName(null);

        System.out.println( employeeOne.getFirstName().toUpperCase() );

        System.out.println( "Bob" );



    }
}
