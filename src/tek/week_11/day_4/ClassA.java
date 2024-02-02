package tek.week_11.day_4;

public class ClassA {

    private String firstName;
    private String lastName;

    public ClassA(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    private String getFirstName() {
        return firstName;
    }

    private ClassA setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    private String getLastName() {
        return lastName;
    }

    private ClassA setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void print() {
        System.out.println("ClassA print method");
    }

    void printMessage() {
        System.out.println("Message coming from Parent Class");
    }
}
