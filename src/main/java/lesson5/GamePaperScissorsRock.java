package lesson5;

import java.util.Random;
import java.util.Scanner;

public class GamePaperScissorsRock {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int user;
        Random random = new Random();
        int comp;
        int userScore = 0;
        int compScore = 0;
        boolean answer;

        do {
            System.out.println("Choose your fighter!  Paper - 0 / Scissors - 1 / Rock - 2");
            user = scanner.nextInt();
            comp = random.nextInt(3);
            System.out.println("comp" + comp);
            if (comp == user) {
                System.out.println("It's a tie!");
                System.out.println("The Score - " + "You: " + userScore + " Computer: " + compScore);
            } else if (comp < user) {
                System.out.println("You win!");
                userScore++;
                System.out.println("The Score - " + "You: " + userScore + " Computer: " + compScore);
            } else {
                System.out.println("Computer wins!");
                compScore++;
                System.out.println("The Score - " + "You: " + userScore + " Computer: " + compScore);
            }

            System.out.println("Do you want to continue? true/false");
            answer = scanner.nextBoolean();

        } while (answer);

    }
}
