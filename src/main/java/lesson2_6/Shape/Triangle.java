package lesson2_6.Shape;

import lesson2_6.Shape.Shape;

public class Triangle extends Shape {
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base*height/2;
    }
    @Override
    public String toString() {
        return "Triangele " ;
    }

    @Override
    public void resize(int percent) {
        System.out.println("asas");
    }
}
