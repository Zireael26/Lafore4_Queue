public class MyQueue {
    private int[] data;
    protected int front;
    protected int size;

    public static final int DEFAULT_CAPACITY = 5;

    public MyQueue() {
        this(DEFAULT_CAPACITY);
    }

    public MyQueue(int capacity) {
        this.data = new int[capacity];
        this.front = 0;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void enqueue(int val) throws Exception{
        if (this.size() == this.data.length)
            throw new Exception("Queue is full");
        int ai = (this.front + this.size) % this.data.length;
        this.data[ai] = val;
        this.size++;
    }

    public int dequeue() throws Exception {
        if (this.isEmpty())
            throw new Exception("Queue is empty! Can't dequeue");
        int rv = this.data[this.front];
        this.data[this.front] = 0;

        this.front = (this.front + 1) % this.data.length;
        this.size--;

        return rv;
    }

    public int peek() throws Exception{
        if (this.isEmpty())
            throw new Exception("Nothing to show");
        return this.data[this.front];
    }

    public void display() {
        for (int i = 0; i < this.size(); i++) {
            System.out.print(this.data[i] + " ");
        }
    }
}