package tek.week_3.day_1;

public class ActivitySixth {


    /*
        Instructions:
        1. Declare a variable with an initial value.
        2. Use the postfix increment operator on the variable and print its value.
        3. Use the prefix increment operator on the same variable and print its value.
        4. Repeat the process with decrement operators.
        5. Discuss the observed differences between prefix and postfix usage.
    */


    public static void main(String[] args) {

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

        int testNum = 8; // 9, 10, 9,

        System.out.println(testNum++); // 8 (Printed) then --> 8 + 1 = 9 ------> 8
        System.out.println(++testNum); // 9 + 1 = 10 then 10 (Printed)  ----->  10
        System.out.println(testNum--); // 10 (Printed) then 10 - 1 = 9 -----> 10
        System.out.println(++testNum); // 9 + 1 = 10 then 10 (Printed) -----> 10

        // 8, 10 ,10 , 10

        System.out.println( " * * * * * * * * * * * * * * * * * * * * * * * * " );

    }
}
