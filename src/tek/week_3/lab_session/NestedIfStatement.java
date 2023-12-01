package tek.week_3.lab_session;

import com.sun.security.jgss.GSSUtil;

public class NestedIfStatement {

    public static void main(String[] args) {

        boolean firstCondition, secondCondition, thirdCondition;

        firstCondition = true;
        secondCondition = false;
        thirdCondition = true;

        if ( firstCondition ) { // true --> A

            System.out.println("A");

            if ( secondCondition ) { // false
                System.out.println("B");
            } else {
                System.out.println("C"); // -- C
            }

            if ( thirdCondition ) { // true
                System.out.println("D");  // -- D
            } else {
                System.out.println("F");
            }

        } else {
            System.out.println("G");
        }

    }

}
