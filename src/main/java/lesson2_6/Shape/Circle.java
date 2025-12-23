package lesson2_6.Shape;

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
    @Override
    public String toString() {
        return "Circle " ;
    }

    @Override
    public void resize(int percent) {
        radius += radius* percent/100;
    }
}
