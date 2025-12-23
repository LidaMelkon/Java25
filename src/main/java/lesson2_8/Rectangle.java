package lesson2_8;

public class Rectangle implements Resizable{
    private double length;
    private double width;
    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }


    @Override
    public void draw() {
        for (int i = 0; i < length ; i++) {

            for (int j = 0; j < width ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    @Override
    public void resize(int percentage) {
        length += length * percentage/100;
        width += width*percentage/100;

    }
}
