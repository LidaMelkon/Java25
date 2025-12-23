package generics;

public class GenericClass<T> {
    public static int objectCount;
    private T variable;
    public T getVariable(){
        return variable;
    }
    public void setVariable(T variable){
        this.variable = variable;
    }
    public GenericClass(T variable){
        this.variable = variable;
        objectCount++;
    }
    public void showType(){
        System.out.printf("Generic Type " + variable.getClass().getName());
    }
}
