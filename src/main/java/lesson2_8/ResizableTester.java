package lesson2_8;

public class ResizableTester {
    public static void main(String[] args) {
        //Polymorphism
        Resizable resizableObj = new Rectangle(4,6);
        resizableObj.draw();
        resizableObj.resize(30);
        System.out.println("----");
        resizableObj.draw();
        System.out.println("----");
        resizableObj = new Circle(6);
        resizableObj.draw();
        resizableObj.resize(50);

    }
}
