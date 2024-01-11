package tek.week_8.day_3;

public class Child extends Father {

    String childDateOfBirth;

    void printName() {
        System.out.println( name );
    }

    void printLastName() {
        System.out.println(lastName);
    }

/*    public Child(String name, String lastName, String fatherProperty, String childDateOfBirth) {
        super(name, lastName, fatherProperty);
        this.childDateOfBirth = childDateOfBirth;
    }*/
}
