package tek.week_4.day_2;

public class ActivityOne {

    /*

    *   1. AND ( && ):  Both side ( multiple ) conditions must be true.
    *   2. XOR ( ^ ) :  Exactly one of the condition (conditions) needs to be true.
    *   3. OR ( || ) :  At least one of the condition (conditions) needs to be true.
    *   4. NOT ( ! ) :  Reverse the final condition. true --> false or false --> true
    *
    * */

    public static void main(String[] args) {

        boolean conditionOne = true;
        boolean conditionTwo = false;
        //          true    ||  false       &&    true      ^    false     &&     true
        //            true                  &&      true                   &&   true
        //                 true             &&          true
        //                          true
        //                          false
        if ( !(conditionOne || conditionTwo && conditionOne ^ conditionTwo && conditionOne) ) {
            System.out.println("A");
            if (conditionOne || conditionTwo) {
                System.out.println("B");
                if ( conditionOne && conditionTwo) {
                    System.out.println("Z");
                } else if ( conditionOne || conditionTwo) {
                    System.out.println("H");
                } else {
                    System.out.println("U");
                }
            } else if (conditionOne && conditionTwo) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        } else {
            System.out.println("F");
        }
            // 1. a b h d       2. abhdf   3. ABH  4.F
    }

}
