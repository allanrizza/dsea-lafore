package algorithms;

import algorithms.enums.ComplexityEnum;
import algorithms.enums.InfoTypeEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * An abstract class for Algorithms.
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

    /**
     * Info about the algorithm. Example: number of steps and comparisons.
     */
    private Map<InfoTypeEnum, Long> info;

    public Algorithm() {
        this.setInfo(new HashMap<>());
        this.info.put(InfoTypeEnum.STEPS, 0L);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComplexityEnum getComplexity() {
        return complexity;
    }

    public void setComplexity(ComplexityEnum complexity) {
        this.complexity = complexity;
    }

    public Map<InfoTypeEnum, Long> getInfo() {
        return this.info;
    }

    public void setInfo(Map<InfoTypeEnum, Long> info) {
        this.info = info;
    }

    public Map<InfoTypeEnum, Long> incrementInfo(InfoTypeEnum infoType) {
        if (infoType == InfoTypeEnum.STEPS) {
            this.getInfo().compute(infoType, (k, v) -> v + 1);
        } else {
            this.getInfo().computeIfPresent(infoType, (k, v) -> v + 1);
        }
        return this.getInfo();
    }

    public static void example() {}
}