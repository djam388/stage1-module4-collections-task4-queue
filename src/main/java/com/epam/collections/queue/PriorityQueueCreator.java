package com.epam.collections.queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> createdPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        createdPriorityQueue.addAll(firstList);
        createdPriorityQueue.addAll(secondList);

        return createdPriorityQueue;
//        throw new UnsupportedOperationException("You should implement this method.");
    }

}
