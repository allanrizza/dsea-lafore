package algorithms;

import algorithms.enums.ComplexityEnum;
import datastructures.Array;

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
}
