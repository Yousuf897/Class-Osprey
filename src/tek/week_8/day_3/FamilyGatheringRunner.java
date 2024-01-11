package tek.week_8.day_3;

public class FamilyGatheringRunner {

    public static void main(String[] args) {

        // Object of classes
        GrandFather grandFather = new GrandFather();
        Father father = new Father();
        Child child = new Child();
        GrandChild grandChild = new GrandChild();

        // Assigning names to each class
        grandFather.name = "GrandFather";
        grandFather.lastName = "Grand Father lastName";

        // Father class
        father.name = "Father name";
        father.lastName = "Father lastName";
        father.printName();
        father.printLastName();

        // Child class
        child.name = "Child name";
        child.lastName = "Child LastName";
        child.printName();
        child.printLastName();

        // GrandChild class
        grandChild.name = "GrandChild name";
        grandChild.lastName = "GrandChild lastName";
        grandChild.printName();
        grandChild.printLastName();
    }

}
