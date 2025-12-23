package Classes.Classes1;

public class TrafficLightTester {
    public static void main(String[] args) {
        TrafficLight traf = new TrafficLight("red",32);
        System.out.println(traf.color);
        traf.changeColor("green");
        System.out.println(traf.color);
    }
}
