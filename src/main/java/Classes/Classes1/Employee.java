package Classes.Classes1;

public class Employee {
    public String name;
    public String jobTitle;
    public double salary;
    public double calculateMonthlySalary(double salary){
        return salary/12;
    }
    public void updateSalary(double percentageIncrease) {
        salary += salary * (percentageIncrease / 100);
    }
   public Employee(String name, String jobTitle, double salary){
        this.name= name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void work(){
        System.out.println("Employee works");
    }
    public void sleep(){
        System.out.println("Likes to sleep");
    }


}
