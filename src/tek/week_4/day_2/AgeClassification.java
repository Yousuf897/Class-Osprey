package tek.week_4.day_2;

public class AgeClassification {

    /*
    * Age Group Classification

    Objective: Classify individuals into age groups based on their age.

    You're designing a system that categorizes individuals into age groups:
    *  Child (0-12),
    * Teenager (13-19),
    * and Adult (20 and above).
    A user provides their age: int userAge = 15; (This value can be changed for testing).
    Determine the user's age group.
    Print out the age group of the user.
    * */

    public static void main(String[] args) {

        int userAge = 25;

//        Child (0-12)
        if (  userAge <= 12 )
            System.out.println("Child!");
//        Teenager (13-19)
        else if ( userAge <= 19 )
            System.out.println("Teenager!");
//        Adult (20 and above)
        else
            System.out.println("Adult!");
    }

}
