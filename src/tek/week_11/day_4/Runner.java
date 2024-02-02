package tek.week_11.day_4;

public class Runner {

    public static void main(String[] args) {

        Student studentObj = new Student("Bob", 35);

        studentObj.printFirstName();
        studentObj.printAge();

        System.out.println( studentObj.firstName.toUpperCase() );

        System.out.println("Welcome to java class!");





    }

}
