package Test;

class Client implements Callback {
    // Implement Callback's interface
    //When you implement an interface method, it must be declared as public
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }
    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " +
                "may also define other members, too.");
    }
}