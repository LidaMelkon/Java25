package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListTester {
    public static void main(String[] args) {
        List<String> animals = new LinkedList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("bear");
        animals.add("horse");
        animals.get(2);
        Queue<String> animalQueue = new LinkedList<>();
        animalQueue.add("pig");
        animalQueue.add("hen");
        animalQueue.add("penguin");
        System.out.println(animalQueue.peek());
    }
}