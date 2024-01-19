package tek.week_9.day_3;

public class EmpRunner {

    public static void main(String[] args) {

        var emp1 = new Employee();
        var emp2 = new Employee();
        var emp3 = new Employee();
        var emp4 = new Employee();

        emp1.firstName = "Employee1";


        emp2.firstName = "Employee2";


        emp3.firstName = "Employee3";


        emp4.firstName = "Employee4";


        System.out.println( emp1.firstName );
        System.out.println( emp1.companyName );

        System.out.println( emp2.firstName );
        System.out.println( emp2.companyName );

        System.out.println( emp3.firstName );
        System.out.println( emp4.firstName );

    }

}
