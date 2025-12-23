package lesson5;

public class LearnString {
    public static void main(String[] args) {
        String name ="Lida";
        String newName = name;
        newName = "Bghdo";
        System.out.println(name);
        System.out.println(newName);
        String text = "abc";
        String text2 = "ABC";
        String text3 = new String("abc");
        System.out.println(text == text3); // false, they are different objects
        System.out.println(text == text2); // true, but we never use this for comparing strings because they can refer other objects, == compare the objects
        System.out.println(text.equals(text3)); // equals compare the values not objects

        String hello = "Hello ";
        String world = "world ";
        String helloworld = hello.concat(world);

        char lastChar = name.charAt(3); // index
        int nameLength = name.length();

        System.out.println(text.equalsIgnoreCase(text2));
        System.out.println(world.repeat(5));


    }
}
