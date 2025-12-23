package lesson5;

import java.util.Random;
import java.util.Scanner;
public class VirtualDiceRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
            System.out.println("Roll a dice, for rolling a dice, write - R");
            int[] sides = {1, 2, 3, 4, 5, 6};
            Random random = new Random();
            int randomSide = random.nextInt(sides.length);
            System.out.println(randomSide);
//            String answer = scanner.nextLine();
//            System.out.println(answer);
            answer = scanner.nextInt();
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int count4 = 0;
            int count5 = 0;
            int count6 = 0;
            switch (randomSide) {
                case 0 -> count1++;
                case 1 -> count2++;
                case 2 -> count3++;
                case 3 -> count4++;
                case 4 -> count5++;
                case 5 -> count6++;
            }
            System.out.println("Summery: " + count1 +count2 +count3 +count4 +count5 +count6);
        } while (answer != 0);
    }
}