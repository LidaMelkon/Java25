package lesson8;

public class LearnStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        sb.append("world");
        System.out.println(sb);
        StringBuffer sb2 = sb;
        sb2.append("Java");
        System.out.println(sb);

        StringBuilder str = new StringBuilder("Lorem");
        str.append("Ipsum");
        System.out.println(str);
        StringBuilder str2 = str;
        str2.append("text");
        str2.reverse();
        System.out.println(str2);
    }
}
