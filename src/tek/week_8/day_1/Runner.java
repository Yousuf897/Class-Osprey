package tek.week_8.day_1;

public class Runner {

    public static void main(String[] args) {

        // Different copies (objects) of the same class called Student
        Student studentOneObj = new Student( 1, "Tony", "Alexander", "MM/DD/YYYY" );
        Student studentTwoObj = new Student(2, "John", "Tobias", "MM/DD/YYYY");
        Student studentThreeObj = new Student(3, "Eric", "Murphy", "MM/DD/YYYY");

        Vehicle vehicleObj = new Vehicle();

        // Student Information Calls
        studentOneObj.printStudentDetails();
       /* studentTwoObj.printStudentDetails();
        studentThreeObj.printStudentDetails();
        // Vehicle Information Calls
        System.out.println( vehicleObj.toString() );*/

        // update Student Information
        studentOneObj.updateStudentInformation(1, "Trevor", "Alexander", "MM/DD/YYYY");
        studentOneObj.printStudentDetails();
    }
}
