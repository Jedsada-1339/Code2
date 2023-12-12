public class excercise2_2 {
    public static void main(String[] args) {
        // Check if there are command line arguments
        if (args.length == 0) {
            System.out.print("Usage: java EvenNumbers <integer1> <integer2> ... <integerN>");
            System.exit(1);
        }

        // Filter even integers
        int[] evenIntegers = filterEvenIntegers(args);

        // Display each member of the array
        System.out.println("Even integers in the array:");
        for (int num : evenIntegers) {
            System.out.print(num +" ");
        }
    }

    private static int[] filterEvenIntegers(String[] args) {
        int[] evenIntegers = new int[args.length];
        int count = 0;

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                if (num % 2 == 0) {
                    evenIntegers[count++] = num;
                }
            } catch (NumberFormatException e) {
                // Ignore non-integer arguments
            }
        }

        // Trim the array to the actual size
        return java.util.Arrays.copyOf(evenIntegers, count);
    }
}

