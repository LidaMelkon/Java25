package lesson2_8.Exceptions;

import java.util.Random;

class HandleError {

    public static void main(String[] args) {
//        int a=0, b=0, c=0;
//        Random r = new Random();
//        for(int i=0; i<32000; i++) {
//            try {
//                b = r.nextInt();
//                c = r.nextInt();
//                a = 12345 / (b/c);
//            } catch (ArithmeticException e) {
//                System.out.println("Division by zero.");
//                a = 0; // set a to zero and continue
//            }
//            System.out.println("a: " + a);
//        }

        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int[] c = { 1 };
            c[42] = 99;
        } catch(ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index oob: " + e);
        }
        System.out.println("After try/catch blocks.");
    }


}
