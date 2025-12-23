package lesson1_4;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter a number");
        int number = scanner.nextInt();
        for(int i = 0; i < number; i+=2 ){
            System.out.println(i);
        }
    }
}
