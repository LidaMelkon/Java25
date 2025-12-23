package Classes.Classes1;

public class Triangle {
    private double a;
    private double b;
    private double c;
    private boolean isValid;

    // private boolean isValidTriangle;
    public Triangle(double a, double b, double c) {

        isValidSides();
        isValidTriangle();
        this.isValid = isValidSides() && isValidTriangle();
        if (isValid){
            this.a = a;
            this.b = b;
            this.c = c;
        }else {
            System.out.println("Invalid inputs");
        }

    }

    public double parameter() {
            return a + b + c;
    }

    public double area() {
            double p = parameter() / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public boolean isValidTriangle() {
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }

    public boolean isValidSides() {
        return (a > 0 && b > 0 && c > 0);
    }


}
