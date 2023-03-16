package utils;

import algorithms.Algorithm;
import algorithms.LaforeAlgorithm;

/**
 * A very simple utils class to display a nice visual presentation for an algorithm.
 */
public final class DisplayUtils {

    private static final String START_MESSAGE_PREFIX = "================================= START ";
    private static final String END_MESSAGE_PREFIX = "================================== END ";
    private static final String LAFORE_S_ALGORITHM = "LAFORE'S ALGORITHM";
    private static final String MESSAGE_SEPARATOR = " =======================================\n\n\n";

    private DisplayUtils() {
        throw new AssertionError("Cannot instantiate this class.");
    }

    public static void displayStartAlgorithm(Algorithm algorithm) {
        String startMessage = String.format("%s%s%s%s", START_MESSAGE_PREFIX,
                algorithm instanceof LaforeAlgorithm ? LAFORE_S_ALGORITHM : "",
                algorithm.getName(), MESSAGE_SEPARATOR);
        System.out.println(startMessage);
    }

    public static void displayEndAlgorithm(Algorithm algorithm) {
        String endMessage = String.format("%s%s%s%s", END_MESSAGE_PREFIX,
                algorithm instanceof LaforeAlgorithm ? LAFORE_S_ALGORITHM : "",
                algorithm.getName(), MESSAGE_SEPARATOR);
        System.out.println(endMessage);
    }
}