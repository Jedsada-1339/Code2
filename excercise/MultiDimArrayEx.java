import java.util.Arrays;

public class MultiDimArrayEx {
    public static void main(String[] args) {
        String studentID = "663040133-9";
        
        int lastDigit = Character.getNumericValue(studentID.charAt(studentID.length() - 1));

        int[][] multiDimArray = {
                {1, 8, 7, 6},
                {5, 3},
                {1, 2, 9}
        };

        int[][] multiDimArray2 = {
                {1, 8, 7, 6},
                {5, 3},
                {lastDigit, lastDigit, lastDigit}
        };

        System.out.println("Original Array:");
        printArray(multiDimArray);

        sortFirstTwoRows(multiDimArray2);

        System.out.println("\nArray after sorting first two rows:");
        printArray(multiDimArray2);
    }
    private static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static void sortFirstTwoRows(int[][] array) {
        Arrays.sort(array[0]);
        Arrays.sort(array[1]);
    }
}
