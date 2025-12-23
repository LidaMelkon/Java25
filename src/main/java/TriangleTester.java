import Classes.Classes1.Triangle;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.stream.Stream;

public class TriangleTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write triangle 1st side value");
        double a = scanner.nextDouble();
        System.out.println("Write triangle 2nd side value");
        double b = scanner.nextDouble();
        System.out.println("Write triangle 3rd side value");
        double c = scanner.nextDouble();


        Triangle triangle = new Triangle(a,b,c);
        System.out.println("The triangle parameter is "+ triangle.parameter());
        System.out.println("The triangle area is " + triangle.area());
    }
}
