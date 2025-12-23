package lesson2_6.Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog with name " + getName() + " barks");
    }

    //for downcastibng

    @Override
    public void eat() {
        System.out.println("Cat method eats");
    }
}
