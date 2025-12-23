package lesson8;

public class JavaMixedQuizz {
    public static void main(String[] args) {
        printPyramid(5);



    }

    public static void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


}
//        calculate(5, 0, '/');
//public static void calculate(int a, int b, char operator) {
//    if (b == 0 && operator == '/') {
//        System.out.println("Cannot divide by zero");
//        return;
//
//    }
//
//    switch (operator) {
//        case '+' -> System.out.println(a + b);
//        case '-' -> System.out.println(a - b);
//        case '*' -> System.out.println(a * b);
//        case '/' -> System.out.println(a / b);
//        default -> System.out.println("Invalid operator");
//    }
//
//}

//compareFloatPrecision(458.33f, 458.66d);
//public static void compareFloatPrecision(float f, double d){
//    int fBits = Float.floatToIntBits(f);
//    long dBits = Double.doubleToLongBits(d);
//
//    if(fBits == dBits  ){
//        System.out.println("store the same numerical value");
//    }else System.out.println("don't store the same numerical value");
//}
//printNumber();
//public static void printNumber(){
//    for (int i = 0; i <= 100; i++) {
//        if(i%3 == 0){
//            System.out.println("Fizz");
//        } else if (i%5==0) {
//            System.out.println("Buzz");
//        }else System.out.println(i);
//
//    }
//}

//removeDuplicatedChars(new StringBuffer("anahit"));
//public static void removeDuplicatedChars(StringBuffer text) {
//    for (int i = 0; i < text.length(); i++) {
//        char current = text.charAt(i);
//
//        for (int j = i + 1; j < text.length(); j++) {
//
//            if (current == text.charAt(j)) {
//                text.deleteCharAt(j);
//                j--;
//            }
//        }
//    }
//    System.out.println(text);
//}


//isPalindrome("level");
//public static void isPalindrome(String text){
//    for(int i=0; i<text.length();i++){
//        if (text.charAt(text.length() - 1 - i) != text.charAt(i)){
//            System.out.println("Is not palindrome");
//            return;
//        }
//    }
//    System.out.println("Palindrome");
//}


//System.out.println(replaceMyString(new StringBuilder("Lorem ipsum dolor sit amet")));
//public static StringBuilder replaceMyString(StringBuilder text) {
//    for (int i = 1; i <= text.length(); i+=2) {
//        text.setCharAt(i,'*');
//    }
//    return  text;
//}


//public static boolean isMultiply(int num1, int num2){
//    if(num2==0){
//        return false;
//    }
//    return num1%num2==0;
//}

//int num;
//int result = num%2==0?"even":"odd";
//double d = 45.36d;
//int i = (int) 45.52d;

//int num1 = 20;
//int num2 = 30;
//num1 = num1 +num2;
//num2 = num1-num2;
//num1= num1-num2;
//        System.out.println(num1);
//        System.out.println(num2);

//byte b = 1;
//short s = 45;
//int i = 23;
//long l = 852;
//double d = 45.8;
//float f = 45.55f;
//char ch = 'a';
//        System.out.println(ch);