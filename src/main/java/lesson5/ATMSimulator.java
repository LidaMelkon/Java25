//package lesson5;
//
//import java.util.Scanner;
//
//public class ATMSimulator {
//
//    public static void main(String[] args) {
//        System.out.println("ATM Menu:");
//        System.out.println("1. Deposit");
//        System.out.println("2. Withdraw");
//        System.out.println("3. Check Balance");
//        System.out.println("4. Exit");
//        System.out.print("Please choose an option: ");
//        int userChoice = scanner.nextInt();
//
//
//        switch (userChoice){
//            case 1 -> deposit();
//            case 2 -> withdraw();
//            case 3 -> checkBalance();
//            case 4 -> break;
//        }
//
//
//    }
//
//    public static int deposit(){
//        System.out.println("Enter the amount to deposit: ");
//        int depositAmount = scanner.nextInt();
//        balance += depositAmount;
//        return;
//    }
//    public static int withdraw(){
//        System.out.print("Enter the amount to withdraw: ");
//        int withdrawAmount = scanner.nextInt();
//        balance -= withdrawAmount;
//        return;
//    }
//    public static void checkBalance() {
//        System.out.println("Your balance is: " + balance);
//    }
//
//
//}
