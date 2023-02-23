package algorithms;

import algorithms.enums.ComplexityEnum;

/**
 * An abstract class for Algorithms.
 * @author Allan G. Rizza
 */
public abstract class Algorithm {
    /**
     * The name of algorithm.
     */
    private String name;

    /**
     * The complexity of the algorithm based on Big O notation.
     */
    private ComplexityEnum complexity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComplexity() {
        return complexity.toString();
    }

    public void setComplexity(ComplexityEnum complexity) {
        this.complexity = complexity;
    }
}
