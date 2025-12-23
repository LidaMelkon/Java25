package lesson2_6.Shape;

public class Rectangle extends Shape implements Resizeable {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangele " ;
    }

    @Override
    public void resize(int percent) {
        length += length * percent/100;
        width += width * percent/100;
    }
}
