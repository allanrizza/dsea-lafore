import algorithms.BubbleSort;
import datastructures.Array;

public class Application {
    public static void main(String[] args) {
        System.out.println("================================= BUBBLE SORT ======================================");
        Array array = new Array(new int[]{5, 2, 4, 6, 1, 3});
        System.out.println("ORIGINAL ARRAY:");
        array.display();

        BubbleSort.sort(array);
        System.out.println("SORTED ARRAY AFTER BUBBLE SORT ALGORITHM (algorithm with complexity O(N²)):");
        array.display();
        System.out.println("====================================================================================");
    }
}