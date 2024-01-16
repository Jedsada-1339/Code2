import java.util.Arrays;

public class Pretest {
      static void output(int[] number){
      for (int num : number){
      System.out.print(num +" " );
      }
      System.err.println("");
      }
      
      static void sortArray(int[] number){
      Arrays.sort(number);
     }
      
      static int secondlg(int[] number){
      return number[number.length - 2];
      }
      public static void main(String[] args) {
        int[] number = {1,3,2,4};
        output(number);
        sortArray(number);
        output(number);
        System.out.println(secondlg(number));
        System.out.println(Arrays.binarySearch(number,4));
      }
    /*   
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + " ");
                System.out.println(j);
            }
            /*
             * 1 1
             * 1 2
             * 1 3
             * 2 1
             * 2 2
             * 2 3
             * 3 1
             * 3 2
             * 3 3
             */
        } 