package algorithms;

import algorithms.enums.ComplexityEnum;

/**
 * In some parts of his book, Robert Lafore uses specific algorithms to presents some ideas. That's what this class represents.
 * @author Allan G Rizza
 */
public class LaforeAlgorithm extends Algorithm {
    public LaforeAlgorithm() {
        this.setName(null);
    }

    /**
     * Throws a new {@code RuntimeException} if an attempt is made to use {@code setComplexity} for a {@code LaforeAlgorithm}.
     * @param complexity The complexity of the algorithm.
     */
    @Override
    public void setComplexity(ComplexityEnum complexity) {
        throw new RuntimeException("ERROR: LAFORE'S ALGORITHMS CAN'T HAVE COMPLEXITY VALUES.");
    }
}
