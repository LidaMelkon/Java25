package lesson2_6.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat with name " + getName() + " meows");
    }
}
