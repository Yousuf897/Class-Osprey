package tek.week_8.day_3;

public class ClassB extends Student {

    String address;

    public ClassB(String name, String lastName, String phoneNumber, int age, String dateOfBirth, String address) {
        super(name, lastName, phoneNumber, age, dateOfBirth);
        this.address = address;
    }
}
