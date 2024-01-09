package tek.week_8.day_1;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    Student( int id, String firstName, String lastName, String dateOfBirth ) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
    }

    private int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    private String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String getDateOfBirth() {
        return dateOfBirth;
    }

    private void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void printStudentDetails() {
        System.out.println("Id: " + getId());
        System.out.println("Fist Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Date of Birth: " + getDateOfBirth());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    void updateStudentInformation(int id, String firstName, String lastName, String dateOfBirth) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
    }

}
