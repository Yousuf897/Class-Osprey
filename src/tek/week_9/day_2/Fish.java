package tek.week_9.day_2;

public class Fish extends Animal {
    @Override
    void breath() {
        System.out.println( "Fish breaths under the water!" );
    }

    @Override
    void eat() {
        super.eat();
    }

    @Override
    void noise() {
        super.noise();
    }
}
