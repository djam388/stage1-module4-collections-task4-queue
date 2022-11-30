package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        List<Integer> dishes = new ArrayList<>();
        List<Integer> determinedDishOrder = new ArrayList<>();
        int loop = 0;
        int loop2 = 0;
        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }

        Iterator<Integer> iterator = dishes.iterator();

        while (iterator.hasNext()) {
            int val = iterator.next();

            loop ++;
            loop2 ++;

            if (loop == everyDishNumberToEat) {
                loop = 0;
                loop2 --;
                determinedDishOrder.add(val);
                iterator.remove();

            }
            if (loop2 == dishes.size()) {
                loop2 = 0;
                iterator = dishes.listIterator();
            }
        }

        return determinedDishOrder;
//        throw new UnsupportedOperationException("You should implement this method.");
    }
}
