import algorithms.BinarySearch;
import algorithms.BubbleSort;
import algorithms.SelectionSort;
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

        System.out.println(BinarySearch.find(array, 4));
        DisplayUtils.displayEndAlgorithm(binarySearch);

        array = new Array(new int[]{5, 2, 4, 6, 1, 3});
        SelectionSort selectionSort = new SelectionSort();

        DisplayUtils.displayStartAlgorithm(selectionSort);
        System.out.println("ORIGINAL ARRAY:");
        array.display();

        SelectionSort.sort(array);

        System.out.println("SORTED ARRAY AFTER INSERTION SORT ALGORITHM (algorithm with complexity "+ selectionSort.getComplexity() +"):");
        array.display();
        DisplayUtils.displayEndAlgorithm(selectionSort);
    }
}