package gr.aueb.cf.ch14.homework;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueManager {
    private static final QueueManager INSTANCE = new QueueManager();
    private static final int MAX_SIZE = 5;  // Define the max size of the queue
    private Queue<Integer> queue;

    private QueueManager() {
        queue = new ArrayDeque<>();
    }

    public static QueueManager getInstance() {
        return INSTANCE;
    }

    public void enqueue(int value) {
        if (!isFull()) {
            queue.offer(value);
            System.out.println("Enqueued: " + value);
        } else {
            System.out.println("Queue is full. Cannot enqueue " + value);
        }
    }

    public Integer dequeue() {
        if (!isEmpty()) {
            Integer value = queue.poll();
            System.out.println("Dequeued: " + value);
            return value;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
    }

    public boolean isFull() {
        return queue.size() == MAX_SIZE;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
