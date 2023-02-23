package algorithms.enums;

/**
 * Enumerates the categories of complexity of algorithms.
 * It's based on Big O Notation.
 * @author Allan G. Rizza
 */
public enum ComplexityEnum {
    O1("O(1)"),
    OLOGN("O(log(N))"),
    ON("O(N)"),
    ON2("O(N²)");


    private final String complexity;

    /**
     * The ComplexityEnum constructor.
     * @param complexity The complexity String, which can contain special characters.
     */
    ComplexityEnum(String complexity) {
        this.complexity = complexity;
    }

    /**
     * @return Returns the complexity as text.
     */
    public String toString() {
        return this.complexity;
    }
}
