package lesson2_6.Shape;

import lesson1_4.SwitchCase;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ShapeTester {

    public static void main(String[] args) {
//        Shape circle = new Circle(2.5); // this is called upcasting
//        Shape rectangle = new Rectangle(8.2,6.3);
//        Shape triangle = new Triangle(7.1,5.2);
//        System.out.println(circle.getArea());
//        System.out.println(rectangle.getArea());
//        System.out.println(triangle.getArea());

        Shape shape;
        Shape[] shapes = new Shape[3];


        for(int i = 0; i<3;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose shape");
            String user = scanner.nextLine();


            switch(user){
                case "circle"-> shape =  new Circle(2.5);
                case "rectangle" -> shape =  new Rectangle(8.2,6.3);
                case "triangle" -> shape =  new Triangle(7.1,5.2);
                default -> shape = new Rectangle(0,0);

            }
            shapes[i]= shape;

        }

        for(Shape element:shapes){
            System.out.println(element);
        }

        Resizeable triangle =  new Triangle(52.2,14.2); // sa el e polymorphism,  interface type
        triangle.resize(10);




    }

}
