package tek.week_9.day_2;

public class Runner {

    public static void main(String[] args) {
        var caculatorObj = new Calculator();

        System.out.println(caculatorObj.sum(2,2,20 ));
        System.out.println(caculatorObj.sum(1,2));

        // my objects

        var animal = new Animal();
        var fish = new Fish();
        var dog = new dog();

        // Calling the methods from each one of the objects
        animal.breath();
        fish.breath();
        dog.breath();
    }

}
