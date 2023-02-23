package datastructures;

public class Array {
    private int[] values;

    public Array(int[] values) {
        this.values = values;
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    public void display() {
        for (int value : values) {
            System.out.print(value);
        }
        System.out.println("\n");
    }
}
