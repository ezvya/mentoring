package org.automation.course.genereic_collections;

import java.util.LinkedList;
import java.util.Queue;

public class GenericQueueExample {
    /*
    Когда нужно обрабатывать элементы в порядке поступления (FIFO).
    Для очередей задач, например, в многопоточных системах.
     */

    static Queue<String> queue;

    public static void main(String[] args) {
        queue = new LinkedList<>();

        // Добавляем элементы в очередь
        queue.offer("Task 1");
        queue.offer("Task 2");
        queue.offer("Task 3");

        System.out.println("Queue: " + queue);

        // Получаем первый элемент (но не удаляем)
        System.out.println("Peek: " + queue.peek());

        // Удаляем элементы в порядке поступления (FIFO)
        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }

        System.out.println("Queue after first processing: " + queue);

        queue.offer("Task 3");
        queue.offer("Task 2");
        queue.offer("Task 1");

        // Удаляем элементы в порядке поступления (FIFO)
        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }

        System.out.println("Queue after second processing: " + queue);

    }
}
