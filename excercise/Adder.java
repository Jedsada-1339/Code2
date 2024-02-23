public class Adder {
    // Example usage
    public static void main(String[] args) {
        try {
            // Convert command-line arguments to integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int result = num1 + num2;
            System.out.println("Result: " + result);

        } catch (ArrayIndexOutOfBoundsException ex1) {
            System.err.println("Please provide two arguments");
        } catch (NumberFormatException ex2) {
            System.err.println("Please provide two intreger");
        }
    }
}
