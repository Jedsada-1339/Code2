import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

class Person implements Serializable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }
}

class Student extends Person implements Serializable {
    private double gpa;
    private ArrayList<String> activities;

    public Student(String name, double gpa) {
        super(name);
        this.gpa = gpa;
        this.activities = new ArrayList<>();
    }

    public double getGpa() {
        return gpa;
    }

    public ArrayList<String> getActivities() {
        return activities;
    }

    public void addActivities(ArrayList<String> activities) {
        this.activities.addAll(activities);
    }

    @Override
    public String toString() {
        return "name=" + getName() + "\ngpa=" + gpa + "\nactivities=" + activities ;
    }

    // Additional methods for writeToFile and readFromFile
    public static void writeToFile(Student student) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(student);
            System.out.println("Writting a student object to a file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student readFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Object obj = ois.readObject();
            if (obj instanceof Student) {
                System.out.println("Readding a student object to a file");
                return (Student) obj;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Student manee = new Student("manee", 4.00);
        manee.addActivities(new ArrayList<>(Arrays.asList("Running", "Gameming")));
        System.out.println(manee);

        // Writing to file
        Student.writeToFile(manee);

        // Reading from file
        Student readStudent = Student.readFromFile();
        System.out.println(readStudent);
    }
}
