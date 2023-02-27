package algorithms;

import algorithms.enums.ComplexityEnum;
import datastructures.Array;
import utils.DisplayUtils;

/**
 * @author Allan G. Rizza
 */
public class SelectionSort extends Algorithm {
    /**
     * Creates an InsertionSort object with your respective name and complexity.
     */
    public SelectionSort() {
        this.setName("SELECTION SORT");
        this.setComplexity(ComplexityEnum.ON2);
    }

    /**
     * Sorts the array passed as a parameter with the Selection Sort algorithm.
     * @param array The array to be sorted.
     */
    public static void sort(Array array) {
        int[] a = array.getValues();
        for (int i = 0; i < a.length-1; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[min] > a[j]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

    public static void example() {
        Array array = new Array(new int[]{5, 2, 4, 6, 1, 3});
        SelectionSort selectionSort = new SelectionSort();

        DisplayUtils.displayStartAlgorithm(selectionSort);
        System.out.println("ORIGINAL ARRAY:");
        array.display();

        SelectionSort.sort(array);

        System.out.println("SORTED ARRAY AFTER SELECTION SORT ALGORITHM (algorithm with complexity "+ selectionSort.getComplexity() +"):");
        array.display();
        DisplayUtils.displayEndAlgorithm(selectionSort);
    }
}
