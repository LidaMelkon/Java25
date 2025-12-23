package Classes.Classes1;

public class FrontEndProgrammer extends Programmer{
    public FrontEndProgrammer(String name, String jobTitle, double salary) {
        super(name, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("FrontEndProgrammer is fixing bug");
    }


}
