public class CircularQueueMain {
    CircularQueue queue = new CircularQueue(5);

        queue.insert(0);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.display();
        queue.remove();
        queue.display();
        queue.insert(99);
        queue.remove();
        queue.remove();
        queue.insert(68);
        queue.display();
        System.out.println(queue.peek());
}