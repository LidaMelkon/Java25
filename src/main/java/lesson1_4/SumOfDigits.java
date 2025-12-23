package lesson1_4;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1-3 digit number");
        int num = scanner.nextInt();
        //Solution1
        int sum = 0;
        for (int i = 0; i < 3; i++){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println(sum);

        //Solution2
       // System.out.println("The sum of the digits of the number is " + (num/100 + (num / 10) % 10 + num%10));

    }
}
