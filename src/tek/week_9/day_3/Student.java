package tek.week_9.day_3;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String address;

    public Student(int id, String firstName, String lastName, String address) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAddress(address);
    }

    public Student() {
        this(0, "", "", "");
    }

    public Student(int id, String firstName, String lastName) {
        this(id, firstName, lastName, "");
    }


    private int getId() {
        return id;
    }

    private Student setId(int id) {
        this.id = id;
        return this;
    }

    private String getFirstName() {
        return firstName;
    }

    private Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    private String getLastName() {
        return lastName;
    }

    private Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    private String getAddress() {
        return address;
    }

    private Student setAddress(String address) {
        this.address = address;
        return this;
    }
}
