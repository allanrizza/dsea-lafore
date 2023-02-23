package utils;

import algorithms.Algorithm;

/**
 * A very simple utils class to display a nice visual presentation for an algorithm.
 * @author Allan G. Rizza
 */
public class DisplayUtils {
    public static void displayStartAlgorithm(Algorithm algorithm) {
        System.out.println("================================= START " + algorithm.getName() + " ======================================");
    }

    public static void displayEndAlgorithm(Algorithm algorithm) {
        System.out.println("================================== END " + algorithm.getName() + " =======================================\n\n\n");
    }
}