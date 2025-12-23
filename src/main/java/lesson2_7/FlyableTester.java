package lesson2_7;

public class FlyableTester {
    public static void main(String[] args) {
//        Flyable bird = new Bird();
//        Flyable helicopter = new Helicopter();
//        Flyable spacecraft = new Spacecraft();
//        bird.fly();
//        helicopter.fly();
//        spacecraft.fly();

        ///polymorphism շղարշ
        Flyable flyable = new Bird();
        flyable.fly();
        flyable = new Helicopter();
        flyable.fly();
        flyable = new Spacecraft();
        flyable.fly();
    }
}
