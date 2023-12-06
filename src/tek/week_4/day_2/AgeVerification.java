package tek.week_4.day_2;

public class AgeVerification {


/*    Question: Age Verification for a Theme Park Ride

    A theme park ride has an age restriction. Only those who are 12 years old or older can go on the ride.
    A visitor wants to try the ride and provides their age: int visitorAge = 10; (This value can be changed for testing).
    Check the visitor's age against the age restriction.
    Determine:
    If the visitor is old enough for the ride.
    If the visitor is too young.
    Print out whether the visitor can go on the ride or not.

*/

    public static void main(String[] args) {

        int restriction = 12;
        int visitorAge = 65;

        if ( visitorAge >= restriction )
            System.out.println("You can proceed");
        else
            System.out.println("You're not allowed");

    }

}
