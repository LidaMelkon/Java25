package Classes.Classes1;

public class  Programmer extends Employee {
    public Programmer(String name, String jobTitle, double salary) {
        super(name, jobTitle, salary);
    }
    public double getSalary(){
        return salary;
    }

    @Override
    public void work() {
        System.out.println("Programmer is coding");
    }

    @Override
    public String toString() {
        return "Programmer{}";
    }
}
