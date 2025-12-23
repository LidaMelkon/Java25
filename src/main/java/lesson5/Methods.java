package lesson5;

public class Methods {
    public static void main(String[] args) {
        printSmallestnumber(-4, +6);
        printTotal(5,6);
        isEven(11);
        printPower(2.0, 4);
        printCircleArea(4.5, 3.14);
        getSmallestNumber( 4, 5, -6);
        System.out.println(checkSum(-1,2,3));
        getAverage(2,5,8);
        calcTriangleArea(5,8);
        System.out.println(areConsecutive(-23,-3,-4));

    }
    public static boolean areConsecutive(int a, int b, int c) {
      return  a+1==b && b+1==c ||  a-1==b && b-1==c;
    }


    public static double calcTriangleArea(int base, int height) {
        double area = base * height / 2;
        System.out.println(area);
        return area;
    }
    public static int getAverage(int a, int b, int c){
        int avg = (a+b+c)/3;
        System.out.println(avg);
        return avg;
    }


    public static boolean checkSum(int a , int b , int c){
        return ((a+b)>c || (a+c) > b || (b+c) > a );
    }

    public static int getSmallestNumber(int a, int b, int c){
        if(a < b && a < c){
            System.out.println(a);
            return a;
        } else if (b < a && b < c) {
            System.out.println(c);
            return b;
        }else {
            System.out.println(c);
            return c;
        }
    }

    public static void printCircleArea(double radius, double pi) {
        double area = pi * Math.pow(radius, 2);
        System.out.println(area);
    }
    public static void printPower(double base, int exponent){
        System.out.println(Math.pow(base, exponent));
    }

    public static void isEven(int a) {
        System.out.println(a % 2 == 0);
    }

    public static void printTotal(int a, int b){
        System.out.println(a + b);
    }

    public static void printSmallestnumber(int a, int b) {
        System.out.println(a > b ? a : b);
    }
}

