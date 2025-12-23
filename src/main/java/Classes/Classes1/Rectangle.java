package Classes.Classes1;

public class Rectangle {
    public double width;
    public double height;
    public double area(double width,double height){
        double area = width*height;
        System.out.println(area);
        return area;
    }
    public double perimeter(double width, double height){
        double perimeter = 2*(width+height);
        System.out.println(perimeter);
        return perimeter;
    }

}