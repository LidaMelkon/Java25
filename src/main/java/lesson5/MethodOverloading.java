package lesson5;

public class MethodOverloading {
    public static void main(String[] args){
//        System.out.println(sum(5,-45));
//        System.out.println(sum(5,-45, 23));
//        System.out.println(sum(45.2,-65.63,55.02));
//        sum("hello", "world", 2025);
//        sum(2025, "hello", "world");
        System.out.println(getMax(5,9));
        System.out.println(getMax(45.3f,-5.6f));

    }
    public static int getMax(int a, int b){
        return a>b?a:b;
    }
    public static float getMax(float a, float b){
        return a>b?a:b;
    }

//    public static int sum(int a, int b){
//        return a+b;
//    }
//    public static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    public static void sum(String a, String b, int c){
//        System.out.println(a+b+c);
//    }
//    public static double sum(double a, double b, double c){
//        return a+b+c;
//    }
//    public static void sum(int a, int b, int c){
//        System.out.println(a+b+c);
//    }

}
