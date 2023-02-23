package datastructures;

public class Array {
    public int[] values;

    public Array(int[] values) {
        this.values = values;
    }

    public void display() {
        for (int value : values) {
            System.out.print(value);
        }
        System.out.println("\n");
    }
}
