package lesson2_6.Animal;

public class UpcastingDowncasting {
    public static void main(String[] args) {
        //upcasting
        Animal cat = new Cat("Moew");
        cat.eat();
        Animal dog =  new Dog("Haf");

        //downcasting
        Cat newcat = (Cat) cat;
        newcat.eat();
        Cat newdog = (Cat) dog;


    }
}
