package tek.week_11.day_3;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println( addTwoNumbers(10, 20) );
        int addTwoResult = addTwoNumbers(20, 50);
        System.out.println( addTwoResult + 100 );

        StaticVariablesAndMethods classObj = new StaticVariablesAndMethods();
        classObj.printFirstName();

    }

    public static int addTwoNumbers(int num1, int num2) {
//        int result = num1 + num2;
//        return result;
        return num1 + num2;
    }

}
