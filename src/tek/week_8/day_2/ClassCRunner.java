package tek.week_8.day_2;

public class ClassCRunner {

    public static void main(String[] args) {
        ClassBTest classBObj = new ClassBTest();

       classBObj.numberOne = 10;
        classBObj.numberTwo = 20;

        System.out.println( classBObj.sumTwoNumbers() );

    }

}
