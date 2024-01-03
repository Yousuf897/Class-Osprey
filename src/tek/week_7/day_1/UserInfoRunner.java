
package tek.week_7.day_1;

public class UserInfoRunner {


    public static void main(String[] args) {

        UserInformation userObj = new UserInformation();
        userObj.id = 50;
        userObj.firstName = "BOB";
        userObj.lastName = "Alexander";
        userObj.gender = 'M';
        userObj.dateOfBirth = "MM/DD/YYYY";
        userObj.occupation = "Software Engineer";

        userObj.printUserInfo();

        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );

        UserInformation userObjTwo = new UserInformation();
        userObjTwo.id = 50;
        userObjTwo.firstName = "Tony";
        userObjTwo.lastName = "Peter";
        userObjTwo.gender = 'M';
        userObjTwo.dateOfBirth = "MM/DD/YYYY";
        userObjTwo.occupation = "Junior Software Engineer";

        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );

        System.out.println( sumOfTwoNumbers( 10, 20 ) );
    }

    public static double sumOfTwoNumbers( double numberOne, double numberTwo ) {
        return numberOne + numberTwo;
    }

}