package algorithms;

import algorithms.enums.ComplexityEnum;
import datastructures.Array;

/**
 * @author Allan G. Rizza
 */
public class BubbleSort extends Algorithm {
    /**
     * Creates an BubbleSort object with your respective name and complexity.
     */
    public BubbleSort() {
        this.setName("BUBBLE SORT");
        this.setComplexity(ComplexityEnum.ON2);
    }

    /**
     * Sorts the array passed as a parameter with the Bubble Sort algorithm.
     * @param array The array to be sorted.
     */
    public static void sort(Array array) {
        for (int i = array.getValues().length-1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(array.getValues()[j] > array.getValues()[j+1]) {
                    int temp = array.getValues()[j+1];
                    array.getValues()[j+1] = array.getValues()[j];
                    array.getValues()[j] = temp;
                }
            }
        }
    }
}
