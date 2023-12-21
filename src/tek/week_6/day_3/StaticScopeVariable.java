package tek.week_6.day_3;

public class StaticScopeVariable {

/*     3. Class Scope (Static Scope):
    •	Static variables belong to the class itself, not to any specific instance (object).
    •	They can be accessed using the class name or directly within static methods.

            */

     static String firstName;
     static String lastName;

    public static void main(String[] args) {


        System.out.println( firstName );

        System.out.println( lastName );

    }

}
