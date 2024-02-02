package tek.week_11.day_4;

public class ClassB extends ClassA {

    private int age;
    private String Address;

    private String firstName;

    public ClassB(String firstName, String lastName, int age, String address) {
       super(firstName, lastName);
        setAge(age);
        setAddress(address);
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private String getAddress() {
        return Address;
    }

    private ClassB setAddress(String address) {
        Address = address;
        return this;
    }

    @Override
    public String toString() {
        return "ClassB{" +
                "age=" + age +
                ", Address='" + Address + '\'' +
                '}';
    }

    public void print() {
        System.out.println("ClassB print method");
    }

    void printAddress() {
        super.print();
//        super.firstName = "Bob";
    }

    @Override
    void printMessage() {
        System.out.println("Message coming from Child Class");
    }
}
