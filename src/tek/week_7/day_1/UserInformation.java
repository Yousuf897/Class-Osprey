package tek.week_7.day_1;

import org.w3c.dom.ls.LSOutput;

public class UserInformation {

    // * * * * *  * * * * *  * * * * *  * * * * *  * * * * *
    // Fields ( Variables )

     int id;
     String firstName;
    String lastName;
    char gender;
    String dateOfBirth;
    String occupation;

    // * * * * *  * * * * *  * * * * *  * * * * *  * * * * *
    // Methods

    public void printUserInfo() {
        System.out.println("Id: " + id  );
        System.out.println("FirstName " + firstName  );
        System.out.println("LastName " + lastName  );
        System.out.println("Gender " + gender  );
        System.out.println("Date of Birth " + dateOfBirth  );
        System.out.println("Occupation" + occupation  );
    }

}
