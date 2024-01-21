import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentCollection {

    static class Student23 {
        String name;
        String favoriteCourse;

        public Student23(String name, String favoriteCourse) {
            this.name = name;
            this.favoriteCourse = favoriteCourse;
        }

        @Override
        public String toString() {
            return name + " FavoriteCourse = " + favoriteCourse;
        }
    }

    static class ComEnStudent extends Student23 {

        public ComEnStudent(String name, String favoriteCourse) {
            super(name, favoriteCourse);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    static class DmeEnStudents extends Student23 {

        public DmeEnStudents(String name, String favoriteCourse) {
            super(name, favoriteCourse);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    static class FavoriteCourseComparator implements Comparator<Student23> {
        @Override
        public int compare(Student23 student1, Student23 student2) {
            return student1.favoriteCourse.compareTo(student2.favoriteCourse);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student23> students = new ArrayList<>();
        students.add(new DmeEnStudents("Fong", "LCA"));
        students.add(new ComEnStudent("Gift", "Adcom"));
        students.add(new ComEnStudent("Dove", "Sleeping call"));

        System.out.println("Before sorting:");
        System.out.println(students);

        Collections.sort(students, new FavoriteCourseComparator());

        System.out.println("After sorting by favorite course:");
        System.out.println(students);
    }
}
