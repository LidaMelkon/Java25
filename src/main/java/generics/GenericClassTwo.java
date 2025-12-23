package generics;

public class GenericClassTwo<T,V extends Number> {
    public static int objectCount;
    private T variable;
    private V variableTwo;
    public T getVariable(){
        return variable;
    }
    public void setVariable(T variable){
        this.variable = variable;
    }
    public void setVariableTwo(V variableTwo) {
        this.variableTwo = variableTwo;
    }
    public V getVariableTwo() {
        return variableTwo;
    }
    public GenericClassTwo(T variable, V variableTwo){
        this.variable = variable;
        this.variableTwo = variableTwo;
        objectCount++;
    }
    public void showType(){
        System.out.println("Generic Type " + variable.getClass().getName());
        System.out.println("Generiv Type two" + variableTwo.getClass().getName());
    }

}
