package tek.week_11.day_4;

public class ClassC extends ClassB {

    private int phoneNumber;
    private String emailAddress;

//    public int age;


    public ClassC(String firstName, String lastName, int age, String address, int phoneNumber, String emailAddress) {
        super(firstName, lastName, age, address);
        setPhoneNumber(phoneNumber);
        setEmailAddress(emailAddress);
    }

    private int getPhoneNumber() {
        return phoneNumber;
    }

    private ClassC setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    private String getEmailAddress() {
        return emailAddress;
    }

    private ClassC setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    @Override
    public String toString() {
        return "ClassC{" +
                "phoneNumber=" + phoneNumber +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    void printAgeFromClassC() {
//        System.out.println( super.age );
    }
}
