package datastructures;

public class Stack {
    private final long[] stackArray;
    private final int maxSize;
    private int top;

    public Stack(int s) {
        this.maxSize = s;
        this.top = -1;
        this.stackArray = new long[maxSize];
    }

    public void push(long j) {
        if(top == maxSize) throw new ArrayIndexOutOfBoundsException();
        this.stackArray[++top] = j;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize-1);
    }

}
