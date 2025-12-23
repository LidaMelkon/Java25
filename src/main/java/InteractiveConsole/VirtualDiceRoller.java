package InteractiveConsole;

import java.util.Random;
import java.util.Scanner;

public class VirtualDiceRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;

        do {
            System.out.println("Roll a dice, for rolling a dice, write 'R' or type '0' to stop:");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("R")) {
                Random random = new Random();
                int randomSide = random.nextInt(6) + 1;
                System.out.println("You rolled a " + randomSide);

                switch (randomSide) {
                    case 1: count1++; break;
                    case 2: count2++; break;
                    case 3: count3++; break;
                    case 4: count4++; break;
                    case 5: count5++; break;
                    case 6: count6++; break;
                }
            } else if (userInput.equals("0")) {
                break;
            } else {
                System.out.println("Invalid input. Please type 'R' to roll or '0' to stop.");
            }


            System.out.println("Would you like to roll again? Type 'R' to roll or '0' to stop.");

        } while (true);

        System.out.println("Summary of rolls:");
        System.out.println("1 was rolled " + count1 + " times");
        System.out.println("2 was rolled " + count2 + " times");
        System.out.println("3 was rolled " + count3 + " times");
        System.out.println("4 was rolled " + count4 + " times");
        System.out.println("5 was rolled " + count5 + " times");
        System.out.println("6 was rolled " + count6 + " times");

        scanner.close();
    }
}

