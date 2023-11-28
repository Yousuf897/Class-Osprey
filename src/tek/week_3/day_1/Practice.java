package tek.week_3.day_1;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        String firstName, lastName, middleName;
        int age;

        Scanner input = new Scanner(System.in); // Object --> Copy

        firstName = "Bob";

        lastName = input.nextLine();
        age = input.nextInt();


        System.out.println( firstName );
        System.out.println( lastName );
        System.out.println( age );

    }

}
