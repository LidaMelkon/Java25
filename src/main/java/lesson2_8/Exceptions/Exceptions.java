package lesson2_8.Exceptions;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            int a = 5;
           int b = scanner.nextInt();
            System.out.println(a / b);
        } // catch (InputMismatchException e | InputMismatchException e ) {
         //System.out.println(e.getMessage());
        // }
        catch (InputMismatchException e) {
            System.out.println(e.getMessage()); //e.getMessage() , "Invalid input"
       } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("this is finally");
        }
       System.out.println("Hello");

//       createFileAndWriteToFile();
//
//        try {
//            createFileAndWriteToFile1();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static void createFileAndWriteToFile(){
//        File file = new File("test.txt");
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter(file);
//            writer.write("Hello Lida");
//            writer.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//
//        public static void createFileAndWriteToFile1() throws IOException {
//        File file = new File("test.txt");
//        FileWriter writer = new FileWriter(file);
//        writer.write("Hello Lida");
//        writer.close();
//
//    public static String readFile(){
//        File file = new File("test.txt");
//    StringBuilder sb = new StringBuilder();
//
//
//
//        try {
//              BufferedReader br = new BufferedReader(new FileReader(file));
//              String line = null;
//            while ((line = br.readLine()) !=null){
//           sb.append(line + "\n");
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//       }
//       return sb.toString();
//
//    }
//
    }


}
