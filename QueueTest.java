public class QueueTest {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue(4);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5); // This will throw an exception
        q.display();
        System.out.println(q.getFront());
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());

    }
}
