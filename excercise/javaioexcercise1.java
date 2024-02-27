import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class javaioexcercise1 {
    public static void writeToFile(String filename, String studentId, String name) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Student ID: " + studentId + " Name: " + name);
            System.out.println("Writting " + studentId + " " + name + " to file " +filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void readFromFile(String filename, String studentId, String name) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("Reading " + studentId + " " + name + " from file " +filename);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ThaiInfoProgram <filename>");
            System.exit(1);
        }

        String filename = args[0];

        String studentId = "663040133-9";
        String name = "Jedsada";

        writeToFile(filename, studentId, name);
        readFromFile(filename, studentId, name);
    }
}
