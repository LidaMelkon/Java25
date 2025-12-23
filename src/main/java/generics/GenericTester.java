package generics;

public class GenericTester {
    public static void main(String[] args) {

        GenericClass<String> generic = new GenericClass<>("Hello");
        System.out.println(generic.getVariable());
        generic.showType();
        System.out.println(GenericClass.objectCount);
        GenericClass<Integer> genericInt = new GenericClass<Integer>(52);
        System.out.println(genericInt.getVariable());
        genericInt.showType();
        GenericClassTwo<String, Integer> twoGeneric = new GenericClassTwo<>("Text", 45);
        System.out.println(twoGeneric.getVariableTwo());
        twoGeneric.showType();
        // generic method
        System.out.println(sum(4, 5));
        showType("asas", 455.6);
    }

    //generic method
    public static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T, V> void showType(T a, V b) {
        System.out.printf("Generic Type T " + a.getClass().getName());
        System.out.println("Generic Type V " + a.getClass().getName());


    }
}
