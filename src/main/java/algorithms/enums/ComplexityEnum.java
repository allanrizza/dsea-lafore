package algorithms.enums;

public enum ComplexityEnum {
    O1("O(1)"),
    OLOGN("O(log(N))"),
    ON("O(N)"),
    ON2("O(N²)");


    private final String complexity;

    ComplexityEnum(String complexity) {
        this.complexity = complexity;
    }

    public String toString() {
        return this.complexity;
    }
}
