package algorithms;

import algorithms.enums.ComplexityEnum;
import datastructures.Array;
import utils.DisplayUtils;

/**
 * @author Allan G. Rizza
 */
public class InsertionSort extends Algorithm {
    /**
     * Creates an InsertionSort object with your respective name and complexity.
     */
    public InsertionSort() {
        this.setName("INSERTION SORT");
        this.setComplexity(ComplexityEnum.ON2);
    }

    /**
     * Sorts the array passed as a parameter with the Insertion Sort algorithm.
     *
     * @param array The array to be sorted.
     */
    public static void sort(Array array) {
        for (int i = 1; i < array.getValues().length; i++) {
            int temp = array.getValues()[i];
            int j = i;
            while(j > 0 && array.getValues()[j-1] >= temp) {
                array.getValues()[j] = array.getValues()[j-1];
                --j;
            }
            array.getValues()[j] = temp;
        }
    }

    public static void example() {
        Array array = new Array(new int[]{5, 2, 4, 6, 1, 3, 6});
        SelectionSort selectionSort = new SelectionSort();

        DisplayUtils.displayStartAlgorithm(selectionSort);
        System.out.println("ORIGINAL ARRAY:");
        array.display();

        InsertionSort.sort(array);

        System.out.println("SORTED ARRAY AFTER INSERTION SORT ALGORITHM (algorithm with complexity "+ selectionSort.getComplexity() +"):");
        array.display();
        DisplayUtils.displayEndAlgorithm(selectionSort);
    }
}
