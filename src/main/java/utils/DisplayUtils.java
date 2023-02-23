package utils;

import algorithms.Algorithm;

public class DisplayUtils {
    public static void displayStartAlgorithm(Algorithm algorithm) {
        System.out.println("================================= START " + algorithm.getName() + " ======================================");
    }

    public static void displayEndAlgorithm(Algorithm algorithm) {
        System.out.println("================================== END " + algorithm.getName() + " =======================================");
    }
}