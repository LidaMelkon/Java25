package lesson1_4;

import java.util.Scanner;

public class PermissionRollerCoaster {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wright your age");
        int age = scanner.nextInt();
        System.out.println("Write your height in cm" );
        int height = scanner.nextInt();
        if( height <= 140 || height>= 200 || age<12 ){
            System.out.println("You are not allowed to ride a roller coaster");
        }else if (age<18){
            System.out.println("You need to provide a parental permission");
        }else {
            System.out.println("You are allowed, have fun!");
        }
    }
}
