package InteractiveConsole;

import java.util.Random;
import java.util.Scanner;

public class MathQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        while (true) {

            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;

            int operation = random.nextInt(4);

            double correctAnswer = 0;
            String operationSymbol = "";

            switch (operation) {
                case 0:
                    correctAnswer = num1 + num2;
                    operationSymbol = "+";
                    break;
                case 1:
                    correctAnswer = num1 - num2;
                    operationSymbol = "-";
                    break;
                case 2:
                    correctAnswer = num1 * num2;
                    operationSymbol = "*";
                    break;
                case 3:
                    while (num2 == 0) {
                        num2 = random.nextInt(10) + 1;
                    }
                    correctAnswer = (double) num1 / num2;
                    operationSymbol = "/";
                    break;
            }

            System.out.println("What is " + num1 + " " + operationSymbol + " " + num2 + "?");

            System.out.print("Your answer: ");
            double userAnswer = scanner.nextDouble();

            if (Math.abs(userAnswer - correctAnswer) < 0.01) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was: " + correctAnswer);
            }

            System.out.print("\nDo you want to play again? (y/n): ");
            String userChoice = scanner.next();

            if (userChoice.equalsIgnoreCase("n")) {
                System.out.println("Thanks for playing! Your final score is: " + score);
                break;             }
        }
        scanner.close();
    }
}
