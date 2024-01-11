package tek.week_8.day_3;

public class ActivityOne {

    /*

    Activity: Implementing Hierarchical Inheritance

    Task 1: Design a class structure representing different staff members in a school.

    Start with a general class Staff with properties like name, designation, and a method displayDetails().
    Create a specific class Teacher that extends Staff and introduces new methods, such as teachSubject().
    Create another class Janitor derived from Staff, introducing methods like cleanClassroom().

    Task 2: Instantiate objects for Teacher and Janitor. Call the displayDetails() method (from Staff) and the unique methods
    from each derived class (like teachSubject() and cleanClassroom()). What output do you expect?

*/

    public static void main(String[] args) {

        // Creating the objects of teacher and Janitor
        var teacherObj = new Teacher();
        var janitor = new Janitor();

        // Teacher Class
//        teacherObj.captureStaffInformation();
        teacherObj.displayDetails();
        teacherObj.teachSubject();

        // Janitor class
//        janitor.captureStaffInformation();
        janitor.displayDetails();
        janitor.cleanClassroom();

    }
}
