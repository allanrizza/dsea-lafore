package datastructures;


/**
 * @author Allan G. Rizza
 */
public class Queue {
    private int maxSize;
    private long[] values;
    private int front;
    private int rear;
    private  int nItems;

    public Queue(int num) {
        this.maxSize = num;
        this.values = new long[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(int num) {
        if(rear == maxSize-1) {
            rear = -1;
        }
        this.values[++rear] = num;
        nItems++;
    }

    public long remove() {
        long temp = values[front++];
        if(front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public long peek() {
        return values[front];
    }

    public boolean isEmpty() {
        return this.nItems == 0;
    }

    public boolean isFull() {
        return this.nItems == maxSize;
    }

    public int size() {
       return this.nItems;
    }

    public static void example() {
        Queue queue = new Queue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        queue.remove();
        queue.remove();
        queue.remove();

        queue.insert(50);
        queue.insert(60);
        queue.insert(70);
        queue.insert(80);

        while(!queue.isEmpty()) {
            long n = queue.remove();
            System.out.println(n);
            System.out.println("  ");
        }
        System.out.println("  ");
    }
}
