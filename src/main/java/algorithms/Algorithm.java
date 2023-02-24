package algorithms;

import algorithms.enums.ComplexityEnum;
import algorithms.enums.InfoTypeEnum;

import java.util.HashMap;

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

    /**
     * Info about the algorithm. Example: number of steps and comparisons.
     */
    private HashMap<InfoTypeEnum, Long> info;

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

    public String getComplexity() {
        return complexity.toString();
    }

    public void setComplexity(ComplexityEnum complexity) {
        this.complexity = complexity;
    }

    public HashMap<InfoTypeEnum, Long> getInfo(){
        return this.info;
    }

    public void setInfo(HashMap<InfoTypeEnum, Long> info) {
        this.info = info;
    }

    public HashMap<InfoTypeEnum, Long> incrementInfo(InfoTypeEnum infoTypeEnum) {
        if(!this.getInfo().containsKey(infoTypeEnum) || infoTypeEnum.equals(InfoTypeEnum.STEPS)) throw new IllegalArgumentException();
        this.getInfo().replace(infoTypeEnum, this.getInfo().get(infoTypeEnum) + 1);
        this.getInfo().replace(InfoTypeEnum.STEPS, this.getInfo().get(InfoTypeEnum.STEPS) + 1);
        return this.getInfo();
    }
}
