package tek.week_11.day_4;

public class Student {

    String firstName;
    int age;

/*
    public Student() {
        firstName = "";
        age = 0;
    }
*/

    public Student(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    void printAge() {
        System.out.println(age);
    }

    void printFirstName() {
        System.out.println( firstName );
    }

}
