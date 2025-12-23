package Classes.Classes1;

public class Marketolog extends Employee{

    public Marketolog (String name, String jobTitle, double salary) {
        super(name, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("Marketologist is working");
    }
}
