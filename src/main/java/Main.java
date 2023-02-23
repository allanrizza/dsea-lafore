import algorithms.BubbleSort;
import datastructures.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(new int[]{5, 2, 4, 6, 1, 3});
        System.out.println("ORIGINAL ARRAY:");
        array.display();

        BubbleSort.sort(array);
        System.out.println("ORDERED ARRAY AFTER BUBBLESORT ALGORITHM (algorithm with complexity O(N²)):");
        array.display();
    }
}