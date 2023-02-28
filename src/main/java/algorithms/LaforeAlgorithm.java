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

    @Override
    public void setComplexity(ComplexityEnum complexity) {
        throw new RuntimeException("ERROR: LAFORE'S ALGORITHMS CAN'T HAVE COMPLEXITY VALUES.");
    }
}
