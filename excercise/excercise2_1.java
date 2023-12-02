public class excercise2_1 {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 4;
        double i = 2.2, j = 3.3;
        System.out.println("The average of " + a + " " + b + " = " + avg(a, b));
        System.out.println("The average of " + a + " " + b + " " + c + " = " + avg(a, b, c));
        System.out.println("The average of " + i + " " + j + " = " + avg(i, j));
    }

    public static double avg(int num1, int num2) {
        return (num1 + num2) / 2.0;
    }

    // Method to calculate the average of three integers
    public static double avg(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    // Method to calculate the average of two doubles
    public static double avg(double num1, double num2) {
        return (num1 + num2)/2.0;
    }
}
