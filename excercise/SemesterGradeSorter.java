import java.util.Arrays;
import java.util.Scanner;

public class SemesterGradeSorter {
    public static void main(String[] args) {
        final int NUM_SEMESTERS = 3;
        final int NUM_GRADES = 5;

        float[][] grades = new float[NUM_SEMESTERS][NUM_GRADES];

        Scanner scanner = new Scanner(System.in);

        for (int semester = 0; semester < NUM_SEMESTERS; semester++) {
            System.out.println("Enter grades for Semester " + (semester + 1));

            for (int i = 0; i < NUM_GRADES; i++) {
                grades[semester][i] = scanner.nextFloat();
                if (grades[semester][i] < 0 || grades[semester][i] > 4) {
                    System.out.println("Invalid grade. Please enter a grade between 0 and 4.");
                }
            }
        }

        for (int semester = 0; semester < NUM_SEMESTERS; semester++) {
            Arrays.sort(grades[semester]);
        }
        System.out.println("\nSorted Grades for Each Semester:");
        for (int semester = 0; semester < NUM_SEMESTERS; semester++) {
            System.out.println("Semester " + (semester + 1) + ": " + Arrays.toString(grades[semester]));
        }

        scanner.close();
    }
}
