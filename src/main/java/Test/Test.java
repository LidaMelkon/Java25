package Test;

public class Test {
    private double length;
    private double width;

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

    public void draw() {
        for (int i = 0; i < length ; i++) {

            for (int j = 0; j < width ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }



    public static void main(String[] args) {
        Test rec = new Test();
        rec.setLength(4);
        rec.setWidth(8);
        rec.draw();
    }
}
