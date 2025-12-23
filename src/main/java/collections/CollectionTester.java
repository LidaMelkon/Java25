package collections;

import lesson2_6.Animal.Dog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionTester {
    public static void main(String[] args) {

        List list = new ArrayList();
        System.out.println("is list empty "+ list.isEmpty());

 //Bolory Object en u listy mi hat mec objecta vori mej poqrik objectner enq sarqum
  // listy ira bolor elementnery ditarkuma vorpes Object
        list.add("hello");
        list.add(123);
        list.add(45.67);
        list.add(true);
        list.add(new Dog("Haff"));
        list.add("hello");




//        System.out.println("is list empty "+ list.isEmpty());
//
//
//        for(Object obj:list){
//            System.out.println(obj.getClass().getName());
//        }
//        //downcasting enq anum, vorovhetev listy cankaca elemt Object tipia, u es uzum em iran String type-i mej pahem dra hamar (String)
//       String hello = (String) list.get(0);
//        System.out.println(hello);
//
//        Dog dog = (Dog) list.get(4);
////----------------------------------------------------------
//        for(Object obj:list){
//            System.out.println(obj);
//        }
//
//        list.remove(2);
//        System.out.println("we removed 2nd index");
//        for(Object obj:list){
//            System.out.println(obj);
//        }
//
//        list.remove("hello");
//        for(Object obj:list){
//            System.out.println(obj);
//        }
//
//        list.removeIf(x->x.equals("hello")); ///mejy lyambda experssion e
//
//
//        System.out.println("size of the list " + list.size());


        List secondList = new ArrayList<>();
        secondList.add("hello");
        secondList.add("java");
        secondList.add(123);


        list.addAll(secondList);
        list.addAll(0,secondList);
        System.out.println(list);
       list.removeAll(secondList);
       System.out.println(list);






    }
}
