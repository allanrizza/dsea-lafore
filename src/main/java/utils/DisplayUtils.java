package utils;

import algorithms.Algorithm;
import algorithms.LaforeAlgorithm;

/**
 * A very simple utils class to display a nice visual presentation for an algorithm.
 * @author Allan G. Rizza
 */
public class DisplayUtils {
    public static void displayStartAlgorithm(Algorithm algorithm) {
        if(algorithm instanceof LaforeAlgorithm)
        {
            System.out.println("================================= START LAFORE'S ALGORITHM " + algorithm.getName() + " ======================================");
        }
        else
        {
            System.out.println("================================= START " + algorithm.getName() + " ======================================");
        }

    }

    public static void displayEndAlgorithm(Algorithm algorithm) {
        if(algorithm instanceof LaforeAlgorithm)
        {
            System.out.println("================================== END LAFORE'S ALGORITHM " + algorithm.getName() + " =======================================\n\n\n");
        }
        else
        {
            System.out.println("================================== END " + algorithm.getName() + " =======================================\n\n\n");
        }
    }
}