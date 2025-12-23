package lesson5;

import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double result = 0;
        char[] operator = {'+', '-', '*', '/'};
        Random random = new Random();
        int randomIndex;
        char randomOperator;
        int userScore = 0;
        int compScore = 0;
        boolean answer;
        int userResult;
        do{
            num1 = Math.round(Math.random()*100)/100;
            num2 = Math.round(Math.random()*100)/100;
            randomIndex = random.nextInt(operator.length);
            randomOperator = operator[randomIndex];
            switch(randomOperator){
                case '+':
                    result = num1 + num2;
                    System.out.println(result);
                    System.out.println("Solve the arithmetic operation " + num1 + randomOperator + num2);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println(result);
                    System.out.println("Solve the arithmetic operation " + num1 + randomOperator + num2);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println(result);
                    System.out.println("Solve the arithmetic operation " + num1 + randomOperator + num2);
                    break;
                case '/':
                    result = num1 / num2;
                    System.out.println(result);
                    System.out.println("Solve the arithmetic operation " + num1 + randomOperator + num2);
                    break;
            }
            userResult = scanner.nextInt();
            if (userResult == result) {
                userScore++;
                System.out.println("Your answer is correct");
            }else{
                compScore++;
                System.out.println("Your answer is wrong");
            }
            System.out.println("The Score: You: " + userScore + " System: "+ compScore);
            System.out.println("Do you want to continue? true/false");
            answer = scanner.nextBoolean();
        }while(answer);
    }
}
