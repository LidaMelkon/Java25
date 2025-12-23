package lesson1_4;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 12");
        int month = scanner.nextInt();
//        switch(month){
//            case 1 :
//                System.out.println("January");
//                break;
//            case 2 :
//                System.out.println("February");
//                break;
//        }
        switch (month) {
            case 1 -> System.out.println("Jan");
            case 2 -> System.out.println("Feb");
            default -> System.out.println("404 not found");
        }


    }
}
