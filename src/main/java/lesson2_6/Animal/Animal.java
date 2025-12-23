package lesson2_6.Animal;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name){
        this.name = name;
    }
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
    public void eat(){
        System.out.println("animal eat method");
    }



}
