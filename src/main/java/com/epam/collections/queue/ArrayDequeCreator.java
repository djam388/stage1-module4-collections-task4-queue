package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> createdArrayDeque = new ArrayDeque<>();

        createdArrayDeque.add(firstQueue.poll());
        createdArrayDeque.add(firstQueue.poll());

        createdArrayDeque.add(secondQueue.poll());
        createdArrayDeque.add(secondQueue.poll());

        Iterator iterator = firstQueue.iterator();

        while (iterator.hasNext()) {
            firstQueue.add(createdArrayDeque.pollLast());
            createdArrayDeque.add(firstQueue.poll());
            createdArrayDeque.add(firstQueue.poll());
            secondQueue.add(createdArrayDeque.pollLast());
            createdArrayDeque.add(secondQueue.poll());
            createdArrayDeque.add(secondQueue.poll());
        }

        return createdArrayDeque;
//        throw new UnsupportedOperationException("You should implement this method.");
    }
}
