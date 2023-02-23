import algorithms.BubbleSort;
import datastructures.Array;
import utils.DisplayUtils;

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
    }
}