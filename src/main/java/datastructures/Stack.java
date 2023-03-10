package datastructures;

/**
 * This is the Data Structure Stack class.
 * @author Allan G. Rizza
 */
public class Stack {
    /**
     * This is the private array to use. Note that the array needs to be {@code private} because the methods will be implemented that will make the Stack Object truly work as a Stack.
     */
    private final long[] stackArray;


    /**
     * This variable sets the maximum stack size.
     */
    private final int maxSize;


    /**
     * This variable is used to manipulate the {@code stackArray}.
     */
    private int top;

    /**
     * Create a new Stack, defining its maximum size in the {@code s} parameter.
     * @param s The maximum size of the stack.
     */
    public Stack(int s) {
        this.maxSize = s;
        this.top = -1;
        this.stackArray = new long[maxSize];
    }

    /**
     * This method pushes a value to the top of the stack.
     * It is important to increment the {@code top} value before inserting the new value because if this is done the other way around, the algorithm will replace the existing element at the {@code top} position in the stack.
     * @param j The value to insert into the Stack.
     */
    public void push(long j) {
        if(top == maxSize) throw new ArrayIndexOutOfBoundsException();
        this.stackArray[++top] = j;
    }

    /**
     * This method removes the most recently added value from the Stack.
     * @return The removed value at the {@code top} of the Stack.
     */
    public Long pop() {
        if(top == -1) {
            System.out.println("Can't pop: stack is empty.");
            return null;
        }
        return stackArray[top--];
    }

    /**
     * This method gives the last inserted value from the Stack.
     * @return The last inserted value from the Stack.
     */
    public long peek() {
        return stackArray[top];
    }

    /**
     * This method checks if the stack is empty.
     * @return A boolean (true or false) value.
     */
    public boolean isEmpty() {
        return (top == -1);
    }

    /**
     * This method checks if the stack is full.
     * @return A boolean (true or false) value.
     */
    public boolean isFull() {
        return (top == maxSize-1);
    }

}
