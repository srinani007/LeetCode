package Collections;

import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(5);
        minHeap.add(15);
        minHeap.add(30);
        minHeap.add(25);
        minHeap.add(40);

        System.out.println(minHeap.size());
        System.out.println(minHeap.peek());
        System.out.println(minHeap.toString());
        System.out.println("*******************");

        System.out.println(minHeap.poll());
        System.out.println("*******************");

        System.out.println(minHeap.peek());
        System.out.println(minHeap.size());
        System.out.println(minHeap.toString());

    }
}
