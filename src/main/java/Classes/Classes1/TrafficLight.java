package Classes.Classes1;

public class TrafficLight {
    public String color;
    public int duration;
    public TrafficLight(String color, int duration){
        this.color = color;
        this.duration = duration;

    }


    public void changeColor(String newColor){
        String color;
        this.color = newColor;

    }

    public void checkRedOrGreen(){

    }
}
