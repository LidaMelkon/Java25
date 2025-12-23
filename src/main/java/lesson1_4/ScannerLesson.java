package lesson1_4;

import java.util.Scanner;

public class ScannerLesson {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("What is your age? ");
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println("You can register!");
            System.out.println("Happy to see you");

        } else if (age ==0) {
            System.out.println("Age cann't be 0");
        } else {
            System.out.println("You can't register(");
        }


    }
}
