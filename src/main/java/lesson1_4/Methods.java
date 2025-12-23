package lesson1_4;

public class Methods {
    public static void main(String[] args){
        printHello();
      // int result =  calcArea(4,5);
       // System.out.println(4*5);
        calcRec(4,5);

    }
    public static void printHello(){
        System.out.println("hello");
        printName();

    }
    public static void printName(){
        System.out.println("Lida");
    }
    public static int calcRec(int a, int b){
        int area = a*b;
        return area;
    }

}
