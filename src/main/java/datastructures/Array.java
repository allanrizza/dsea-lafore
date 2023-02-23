package datastructures;
/**
 * @author Allan G. Rizza
 */
public class Array {
    private int[] values;

/**
 * Creates an Array with your values.
 * @param values The simple int type array values.
 */
    public Array(int[] values) {
        this.values = values;
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    /**
     * Displays on the system output (console) the values of the Array object.
     */
    public void display() {
        for (int value : values) {
            System.out.print(value);
        }
        System.out.println("\n");
    }
}
