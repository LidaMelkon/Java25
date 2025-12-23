package lesson1_4;

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

//        int numRandom = (int) (Math.random() * 100) + 1;
//         System.out.println(numRandom);
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 1; i < 100; i++) {
//            int num = scanner.nextInt();
//            if (num == numRandom) {
//                System.out.println("Win");
//                break;
//            } else if (num > numRandom) {
//                System.out.println("Your guess is too high");
//            } else {
//                System.out.println("Your guess is too low");
//            }
////        }
//            // System.out.println(Math.random());
//        }
        boolean isGuesed = true;
        Scanner scanner = new Scanner(System.in);
        int correctNumber = 42;
        System.out.println("Try guess the number between 1 and 100");

        while (isGuesed) {

            int guessTheNumber = scanner.nextInt();
            if (guessTheNumber > 100 || guessTheNumber < 1){
                System.out.println("The entered number must be between 1 and 100");
                break;
            }
            if (correctNumber > guessTheNumber) {
                System.out.println("The correct number is greater than entered number");
                System.out.println("Try guess again");
            } else if (correctNumber < guessTheNumber) {
                System.out.println("The correct number is less than entered number");
                System.out.println("Try guess again");
            } else {
                System.out.println("You guessed the correct number");
                isGuesed = false;
            }


        }
    }

}