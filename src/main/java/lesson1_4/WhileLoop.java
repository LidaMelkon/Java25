package lesson1_4;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
//        int a = 5;
//        int sum = 0;
//        while(a > 0){
//             sum+=a;
//             a--;
//        }
//        System.out.println(sum);


        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        boolean answer;

        do{
            System.out.println("Enter the 1st number");
            num1 = scanner.nextInt();
            System.out.println("Enter the 2nd number");
             num2 = scanner.nextInt();
            System.out.println(num1 + num2);
            System.out.println("Do you want to continue? true/false");
           answer = scanner.nextBoolean();

        }while(answer);

    }


}
