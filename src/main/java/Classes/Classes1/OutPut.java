package Classes.Classes1;

class OutPut
{
    public static void main(String[] arg)
    {
        Student yogesh = new Student("Yogesh", 67, 'B');
        Student narayan = new Student("Narayan", 72);

        Student mahesh = new Student("Mahesh");
        Student kiran = new Student();

        System.out.println("Name = " + yogesh.name + ", section = " + yogesh.section + ", marks = " + yogesh.marks);

        System.out.println("Name = " + narayan.name + ", section = " + narayan.section + ", marks = " + narayan.marks);

        System.out.println("Name = " + mahesh.name + ", section = " + mahesh.section + ", marks = " + mahesh.marks);

        System.out.println("Name = " + kiran.name + ", section = " + kiran.section + ", marks = " + kiran.marks);

    }
}
//output
//Name = Yogesh, section = 67, marks = B
//Name = Narayan, section = 72, marks = '\u0000'
//Name = Mahesh, section = 0, marks = '\u0000'
//Name = null, section = 0, marks = '\u0000'