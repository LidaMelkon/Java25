package lesson1_4;

import java.util.Scanner;

public class GetMultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a positive number");
        int num = scanner.nextInt();
        String result = (num <=0 || num >= 10)? "Let's try again": "Multiplication table";
        System.out.println(result);
        for (int i=1; i<=10; i++){
            System.out.println(num*i);
        }

    }
}
