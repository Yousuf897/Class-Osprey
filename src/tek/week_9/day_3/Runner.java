package tek.week_9.day_3;

public class Runner {

     static String firstName = "Bob";
     int age = 35;

     static void printMessage() {
        System.out.println( "Welcome to TekSchool" );
    }

    public static void main(String[] args) {
        printMessage();
        firstName = "Tony";
    }

}
