package tek.week_9.day_3;

public class OuterClass {

    static int age = 35;
    static String address;

    static class InnerClass {
      void printAge() {
          System.out.println("Tony is " + age + " years old");
          age = 45;
          address = "employee address";
          System.out.println( "The address is: " + address );
      }
    }

}
