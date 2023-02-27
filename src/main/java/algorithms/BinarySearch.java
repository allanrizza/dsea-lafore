package algorithms;

import algorithms.enums.ComplexityEnum;
import algorithms.enums.InfoTypeEnum;
import datastructures.Array;
import utils.DisplayUtils;

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
        this.setComplexity(ComplexityEnum.OLOGN);
        this.getInfo().put(InfoTypeEnum.COMPARISONS, 0L);
        this.getInfo().put(InfoTypeEnum.EXECUTION_TIME, 0L);
    }

    /**
     * @param array The array where need to find the value.
     * @param value the value to be sought.
     * @return Returns the array position of the number, if found. Otherwise, it returns {@code -1}.
     */
    public int find(Array array, int value) {
        if(!array.isSorted()) throw new IllegalArgumentException("The array isn't sorted");
        int curIn;
        int lowerBound = 0;
        int upperBound = array.getValues().length-1;
        while(true) {
            curIn = (upperBound + lowerBound) /2;
            if(array.getValues()[curIn] == value) {
                this.incrementInfo(InfoTypeEnum.COMPARISONS);
                System.out.println("VALUE FOUND AT POSITION " + curIn);
                return value;
            }
            if(lowerBound > upperBound) {
                this.incrementInfo(InfoTypeEnum.COMPARISONS);
                System.out.println("VALUE NOT FOUND.");
                return -1;
            }
            if(value < array.getValues()[curIn]) {
                this.incrementInfo(InfoTypeEnum.COMPARISONS);
                upperBound = curIn-1;
            }
            else {
                this.incrementInfo(InfoTypeEnum.COMPARISONS);
               lowerBound = curIn+1;
            }
        }
    }

    public static void example() {
        Array array = new Array(new int[]{1, 2, 4, 6, 8, 9});
        BinarySearch binarySearch = new BinarySearch();
        DisplayUtils.displayStartAlgorithm(binarySearch);
        array.display();

        System.out.println(binarySearch.find(array, 4));
        System.out.println(binarySearch.getInfo().toString());
        DisplayUtils.displayEndAlgorithm(binarySearch);
    }

}