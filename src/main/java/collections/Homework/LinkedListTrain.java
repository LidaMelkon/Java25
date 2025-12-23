package collections.Homework;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LinkedListTrain {
    public static void main(String[] args) {
        LinkedList<String> trainlinkedlist = new LinkedList<>();
        trainlinkedlist.add("Station A");
        trainlinkedlist.add("Station B");
        trainlinkedlist.add("Station C");
        trainlinkedlist.add("Station D");
        trainlinkedlist.add("Station E");
        trainlinkedlist.add(3,"Station X");
        trainlinkedlist.add(0,"Station Start");
        trainlinkedlist.add("Station End");

        System.out.println("Print the first station " + trainlinkedlist.getFirst());
        System.out.println("Print the last station " + trainlinkedlist.getLast());
        trainlinkedlist.removeFirst();
        trainlinkedlist.removeLast();
        System.out.println("If \"Station X\" is in the route." + trainlinkedlist.contains("Station X"));
        System.out.println("The position (index) of \"Station D\" is " + trainlinkedlist.indexOf("Station D"));
        System.out.println(trainlinkedlist);
    }
}

/*
Add stations in order:
"Station A" → "Station B" → "Station C" → "Station D" → "Station E"

Insert a new station between "Station B" and "Station C" (e.g., "Station X").

Add a station at the beginning (e.g., "Station Start").

Add a station at the end (e.g., "Station End").

Get and print the first station (getFirst()).

Get and print the last station (getLast()).

Remove the first station (removeFirst()).

Remove the last station (removeLast()).

Check if "Station X" is in the route.

Find the position (index) of "Station D".

Print the full list of stations in order.
 */