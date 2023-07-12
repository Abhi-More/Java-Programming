// Queue is data structure that operated in FIFO manner

import java.util.*;
public class QueueDemo {
    public static void main(String[] args) {
        
        Queue<Integer> que = new LinkedList<>();  // new PriorityQueue<>()

        que.add(60);
        que.add(140);
        que.add(1900);
        que.add(140);
        que.add(40);

        System.out.println("Queue: " + que);
        
        // Getting peek element that is first added element
        System.out.println(que.peek());
        
        // Dequeue operation: Remove peek element
        System.out.println("Removed element: " + que.poll());
        System.out.println("Queue: " + que);
        
        que.remove(140);
        System.out.println("Queue: " + que);
        
        System.out.println("Size of queue: " + que.size());
        
    }
}
