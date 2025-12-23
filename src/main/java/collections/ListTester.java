package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListTester {
    public static void main(String[] args) {
        List<String> strlist = new ArrayList<>();
        strlist.add("Lida");
        strlist.add("Mariam");
        strlist.add("Manya");
        strlist.add("Hasmik");
        strlist.add("Alik");
        System.out.println(strlist.get(0).toUpperCase());
        System.out.println(strlist.contains("Mariam"));
        System.out.println(strlist.indexOf("Alik1"));
        strlist.add(1,"Jeniffer");
        System.out.println(strlist);
        List<String> newList = strlist.subList(1,3);
        System.out.println(newList);
        strlist.sort(Comparator.naturalOrder());
        System.out.println(strlist);
        strlist.sort(Comparator.reverseOrder());
        System.out.println(strlist);
//        strlist.sort(String::compareTo);
//        strlist.sort((x,y)->x.length());


    }
}
