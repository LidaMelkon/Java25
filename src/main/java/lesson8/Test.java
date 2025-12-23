package lesson8;

import lesson5.Arrays;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write the number of month to get the count of days");
//        int userAnswer = scanner.nextInt();
//        printCountOfMonth(userAnswer);
       // printRectangle(5);
        printEmptyRectangle(5);

    }
    public static void printRectangle(int digit){
        for (int j = 0; j < digit; j++) {
            for (int i = 0; i < digit; i++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }
    public static void printCountOfMonth(int numberOfMonth){
        switch (numberOfMonth){
            case 1,3,5,7,8,9,11 -> System.out.println("Month " + numberOfMonth + "has 31 days");
            case 4,6,10,12 -> System.out.println("Month " + numberOfMonth + "has 30 days");
            case 2 -> System.out.println("Month " + numberOfMonth + "has 28 days");
        }
    }
    public static void printEmptyRectangle(int size){
        for (int i =0;i<size;i++){
            for (int j=0;j<size;j++){
                if(j==0 || j == size){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


}
