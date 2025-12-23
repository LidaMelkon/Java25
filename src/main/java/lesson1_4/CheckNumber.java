package lesson1_4;

import java.rmi.NoSuchObjectException;
import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number");
        int num = scanner.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is negative");
        }

    }

}
