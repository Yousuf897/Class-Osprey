package tek.week_10.day_1;

public class Employee {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        try {
            return firstName;
        } catch (NullPointerException e) {
            return "FirstName cannot be null, Please send a correct name!";
        }
    }

    public void setFirstName(String firstName) {
            this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    public Employee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
}
