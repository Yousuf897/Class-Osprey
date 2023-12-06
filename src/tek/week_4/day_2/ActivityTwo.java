package tek.week_4.day_2;

public class ActivityTwo {

    public static void main(String[] args) {

        // !( true &&  true  || false ^  false  &&  false ||  false )  && true
    //     !( true   &&   true   || false ^ false  && false || false ) &&       true
    //     ! (  true             ||    false )  &&       true
    //      ! ( true ) &&       true
    //      false & true
        //   false
        if ( !(10 == 10 && 10 == 10 || 9 < 9 ^ 10 > 10 && 10 < 1 || 1 < 0) && (10 == 10) ) {
            System.out.println("A");
        //           false   || false  --> false
        } else if ( 10 > 100 || 10 < 0 ) {
            System.out.println("B");
        //          true  && true
        } else if ( 0 == 0 && 4 == 4 ) {
            System.out.println("C");
        } else {
            System.out.println("Java is interesting!");
        }
    }

    // 1. A   2. C  3. ABC   4. AC      5. AB    6. BC,  7. C - Java is Interesting
    // 8. Java is Interesting

}
