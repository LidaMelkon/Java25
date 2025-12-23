package lesson1_4;

import java.util.Scanner;


public class ReverseDigit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3-digit number ");
        int num = scanner.nextInt();
        if(num>=100 && num<=999) {
            System.out.println("The reverse number is " + (num % 10 * 100 + (num / 10) % 10 * 10 + num / 100));
        }else{
            System.out.println("Please try again by entering 3-digit number");
        }

    }
}
