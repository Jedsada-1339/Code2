
abstract class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    abstract void writePrograms();
}

class ComEnStudent extends Student {
    // Constructor
    public ComEnStudent(String name) {
        super(name);
    }

    @Override
    void writePrograms() {
        System.out.println(name + " writes programs in Python and Java");
    }
}

class DmeEnStudent extends Student {
    // Constructor
    public DmeEnStudent(String name) {
        super(name);
    }

    @Override
    void writePrograms() {
        System.out.println(name + " writes programs in Python and C#");
    }
}

// TestStudents class
public class TestStudents {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new DmeEnStudent("Manee");
        students[1] = new ComEnStudent("mana");
        students[2] = new ComEnStudent("Piti");

        for (Student student : students) {
            student.writePrograms();
        }
    }
}
