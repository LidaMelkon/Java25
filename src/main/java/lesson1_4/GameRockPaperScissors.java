//Create an extended version of the classic Rock, Paper, Scissors game in Java. Allow the user to play multiple rounds against the computer.
// Keep track of the score and display it after each round. Use loops to continue playing until the user decides to quit


package lesson1_4;
import java.util.Scanner;
import java.util.SortedMap;

public class GameRockPaperScissors {
    public static void main(String[] args){
        char comp = 'R';
        Scanner scanner = new Scanner(System.in);
        char user;
        int userScore = 0;
        int compScore = 0;
        boolean answer;

        do{
            System.out.println("Choose your fighter! Rock-R / Paper-P/ Scissors -S");
            user = scanner.nextLine().toUpperCase().charAt(0);
            if(user!='R' && user!='P' && user!='S'){
                System.out.println("You entered invalid data");
            } else if(user == comp){
                userScore+=1;
            }else {
                compScore+=1;
            }
            System.out.println("The Score is " + "You: " + userScore +" Computer: " + compScore);
            System.out.println("Do you want to continue? true/false");
            answer = scanner.nextBoolean();
            scanner.nextLine();

        }while(answer);
    }
}
