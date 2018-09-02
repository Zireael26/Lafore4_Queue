public class Main {

    public static void main(String[] args) throws Exception {

        MyQueue q1 = new MyQueue();
        q1.enqueue(25);
        q1.enqueue(23);
        q1.enqueue(13);

        q1.display();

        System.out.println("\n" + q1.dequeue());
        System.out.println(q1.dequeue());
    }
}