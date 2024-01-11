package tek.week_8.day_3;

public class Father extends GrandFather  {

    String fatherProperty;

    void printName() {
        System.out.println( name );
    }

    void printLastName() {
        System.out.println( lastName );
    }

    void printNameAndLastName() {
        System.out.println(name + " " + lastName);
    }

/*    public Father(String name, String lastName, String fatherProperty) {
        super(name, lastName);
        this.fatherProperty = fatherProperty;
    }*/
}
