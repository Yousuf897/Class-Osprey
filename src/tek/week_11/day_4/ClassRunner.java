package tek.week_11.day_4;

public class ClassRunner {

    public static void main(String[] args) {

        ClassB classBObj = new ClassB(
                "Bob",
                "Alexander",
                35,
                "Virginia"
        );

        ClassC classCObj = new ClassC(
                "Tony",
                "Morphy",
                29,
                "Virginia",
                123456,
                "tony@email.com"
        );

//       classBObj.toString();
//       classCObj.toString();

        classBObj.printAddress();
    }

}
