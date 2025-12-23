package Classes.Classes1;

import java.util.Scanner;

public class EmployeeTester {

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Jennifer", "programmer", 100);
        programmer.work();
        FrontEndProgrammer frontEndProgrammer = new FrontEndProgrammer("Joe","FrontEndProgrammer", 150);
        frontEndProgrammer.work();
        Marketolog marketolog = new Marketolog("Ann", "marketologist", 100);
        marketolog.work();
        Employee programmer2 = new Programmer("Mike", "programmer", 250);
        programmer2.work();
        programmer2.sleep();
        Employee marketolog1 = new Marketolog("Jane", "marketologist1", 110);
        marketolog1.work();


//        Employee[] employees = new Employee[2];
//        emplyees[0]= programmer2;
//        employees[1] = marketolog1;
        Employee[] employees = {programmer2, marketolog1};
//        System.out.println(employees[0]);
//        System.out.println(employees[1]);
//        System.out.println(employees);


        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type ob employee u want?");
        String type = scanner.nextLine();
        switch (type){
            case "1"-> System.out.println(employees[0]);
            case "2" -> System.out.println(employees[1]);
        }

    }
}
