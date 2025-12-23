package lesson1_4;

import java.util.Scanner;

public class PrintRemark {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Select Grade");
        String grade = scanner.nextLine().toUpperCase();
         char charGrade = grade.charAt(0);
         switch ( charGrade ){
             case 'A' -> System.out.println("Grade: " + charGrade + "\n" + "Remark : Excellent!");
             case 'B' -> System.out.println("Grade: " + charGrade + "\n" + "Remark : Well Done");
             case 'C' -> System.out.println("Grade: " + charGrade + "\n" + "Remark : Very Good");
             case 'D' -> System.out.println("Grade: " + charGrade + "\n" + "Remark : Good");
             case 'F' -> System.out.println("Grade: " + charGrade + "\n" + "Remark : Fail");
             default -> System.out.println("Select valid grade");

         }
    }
}
