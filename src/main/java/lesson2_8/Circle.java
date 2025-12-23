package lesson2_8;

public class Circle implements Resizable{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        int centerX = radius;
        int centerY = radius;
        for (int y = 0; y <= 2 * radius; y++) {
            for (int x = 0; x <= 2 * radius; x++) {
                // Calculate the distance from the center using the circle equation
                double distance = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));

//(Math.abs(distance - radius) < 0.5) for the empty
                if (distance <= radius) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    @Override
    public void resize(int percentage) {
        radius+= radius*percentage/100;

    }
}
