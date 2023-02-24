import algorithms.BinarySearch;
import algorithms.BubbleSort;
import algorithms.InsertionSort;
import datastructures.Array;
import utils.DisplayUtils;

/**
 * @author Allan G. Rizza
 */
public class Application {
    public static void main(String[] args) {
        Array array = new Array(new int[]{5, 2, 4, 6, 1, 3});
        BubbleSort bubbleSort = new BubbleSort();
        DisplayUtils.displayStartAlgorithm(bubbleSort);
        System.out.println("ORIGINAL ARRAY:");
        array.display();

        BubbleSort.sort(array);

        System.out.println("SORTED ARRAY AFTER BUBBLE SORT ALGORITHM (algorithm with complexity "+ bubbleSort.getComplexity() +"):");
        array.display();
        DisplayUtils.displayEndAlgorithm(bubbleSort);

        BinarySearch binarySearch = new BinarySearch();
        DisplayUtils.displayStartAlgorithm(binarySearch);
        array.display();

        System.out.println(binarySearch.find(array, 4));
        System.out.println(binarySearch.getInfo().toString());
        DisplayUtils.displayEndAlgorithm(binarySearch);

        array = new Array(new int[]{5, 2, 4, 6, 1, 3});
        InsertionSort insertionSort = new InsertionSort();

        DisplayUtils.displayStartAlgorithm(insertionSort);
        System.out.println("ORIGINAL ARRAY:");
        array.display();

        InsertionSort.sort(array);

        System.out.println("SORTED ARRAY AFTER INSERTION SORT ALGORITHM (algorithm with complexity "+ insertionSort.getComplexity() +"):");
        array.display();
        DisplayUtils.displayEndAlgorithm(insertionSort);
    }
}