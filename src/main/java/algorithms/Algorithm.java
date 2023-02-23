package algorithms;

import algorithms.enums.ComplexityEnum;

public abstract class Algorithm {
    private String name;

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
