import java.util.Scanner;

public class RecursiveSum {

    public static int recursiveSum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + recursiveSum(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter a positive integer (enter a non-positive integer to exit): ");
                int n = Integer.parseInt(scanner.nextLine());

                if (n <= 0) {
                    break;
                }

                int result = recursiveSum(n);
                System.out.println("The sum of 1 to " + n + " is: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        scanner.close();
    }
}
