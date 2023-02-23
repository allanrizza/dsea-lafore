package algorithms;

import algorithms.enums.ComplexityEnum;
import datastructures.Array;

public class BubbleSort extends Algorithm {

    public BubbleSort() {
        this.setName("BUBBLE SORT");
        this.setComplexity(ComplexityEnum.ON2);
    }

    public static void sort(Array array) {
        for (int i = array.values.length-1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(array.values[j] > array.values[j+1]) {
                    int temp = array.values[j+1];
                    array.values[j+1] = array.values[j];
                    array.values[j] = temp;
                }
            }
        }
    }
}
