package algorithms.enums;

/**
 * Enumerates the types of info for algorithms.
 * @author Allan G. Rizza
 */
public enum InfoTypeEnum {
    STEPS("steps"),
    COMPARISONS("comparisons"),
    SWAPS("swaps"),
    EXECUTION_TIME("execution time (ms)");


    private final String infoType;

    /**
     * The ComplexityEnum constructor.
     * @param infoTypeString The String of the info type.
     */
    InfoTypeEnum(String infoTypeString) {
        this.infoType = infoTypeString;
    }

    /**
     * @return Returns the complexity as text.
     */
    public String toString() {
        return this.infoType;
    }
}
