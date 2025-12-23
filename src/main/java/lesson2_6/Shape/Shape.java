package lesson2_6.Shape;
//Any class that contains one or more abstract methods must also be declared abstract. To
//declare a class abstract, you simply use the abstract keyword in front of the class keyword at
//        the beginning of the class declaration. There can be no objects of an abstract class. That is,
//an abstract class cannot be directly instantiated with the new operator. Such objects would
//        be useless, because an abstract class is not fully defined. Also, you cannot declare abstract
//constructors, or abstract static methods. Any subclass of an abstract class must either
//        implement all of the abstract methods in the superclass, or be declared abstract itself.
public abstract class Shape implements Resizeable{
    public abstract double getArea();




}
