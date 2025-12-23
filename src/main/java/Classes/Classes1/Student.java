package Classes.Classes1;

public class Student {
    public String name;
    public int section;
    public char marks;

    Student() {
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int section) {
        this.name = name;
        this.section = section;
    }

    Student(String name, int section, char marks) {
        this.name = name;
        this.section = section;
        this.marks = marks;
    }

}
