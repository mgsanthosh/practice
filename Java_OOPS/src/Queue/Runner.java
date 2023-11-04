package Queue;

public class Runner {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(5);
        queue.enQueue(2);
        queue.enQueue(7);
        queue.enQueue(3);
        System.out.println("Dequeue: " + queue.deQueue());
        System.out.println("Dequeue: " + queue.deQueue());
        queue.enQueue(9);
        queue.enQueue(1);
        queue.enQueue(10);
//        queue.enQueue(19);
        System.out.println(queue.getSize());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.show();
    }
}
