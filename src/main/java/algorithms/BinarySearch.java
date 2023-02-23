package algorithms;

import algorithms.enums.ComplexityEnum;
import datastructures.Array;

/**
 * The binary search algorithm to sorted arrays.
 * @author Allan G. Rizza
 */
public class BinarySearch extends Algorithm {
    /**
     * Creates an BinarySearch object with your respective name and complexity.
     */
    public BinarySearch() {
        this.setName("BINARY SEARCH");
        this.setComplexity(ComplexityEnum.ON);
    }

    /**
     * @param array The array where need to find the value.
     * @param value the value to be sought.
     * @return Returns the array position of the number, if found. Otherwise, it returns {@code -1}.
     */
    public static int find(Array array, int value) {
        int curIn;
        int lowerBound = 0;
        int upperBound = array.getValues().length-1;
        while(true) {
            curIn = (upperBound + lowerBound) /2;
            if(array.getValues()[curIn] == value) {
                System.out.println("VALUE FOUND AT POSITION " + curIn);
                return value;
            }
            if(lowerBound > upperBound) {
                System.out.println("VALUE NOT FOUND.");
                return -1;
            }
            if(value < array.getValues()[curIn]) {
                upperBound = curIn-1;
            }
            else {
               lowerBound = curIn+1;
            }
        }
    }

}