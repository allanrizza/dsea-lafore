package algorithms;

import algorithms.enums.ComplexityEnum;
import datastructures.Array;

public class BinarySearch extends Algorithm {

    public BinarySearch() {
        this.setName("BINARY SEARCH");
        this.setComplexity(ComplexityEnum.ON);
    }

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