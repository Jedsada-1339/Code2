public class BinarySearch {
    int find(int[] a, int searchN){
        int low = 0;
        int high = a.length - 1 ;
        while (low <= high) {
            int middle = (low+high)/2;
            if (a[middle] == searchN) {
                return middle;
            }else if (a[middle]<searchN){
                low = middle + 1;
            }else if (a[middle] > searchN){
                high = middle -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        if (args.length != 1){
            System.err.println("NO NO!");
            System.exit(1);
        }
        BinarySearch bs = new BinarySearch();
        
    }
    
}
