package org.automation.course.genereic_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraysComparison {

    public static void main(String[] args) {
        // Создаем списки
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Добавление элементов
        System.out.println("Adding elements...");
        measureTime(() -> addElements(arrayList, 100_000), "ArrayList add");
        measureTime(() -> addElements(linkedList, 100_000), "LinkedList add");

        // Доступ к элементам
        System.out.println("\nAccessing elements...");
        measureTime(() -> accessElements(arrayList), "ArrayList get");
        measureTime(() -> accessElements(linkedList), "LinkedList get");

        // Удаление элементов
        System.out.println("\nRemoving elements...");
        measureTime(() -> removeElements(arrayList), "ArrayList remove");
        measureTime(() -> removeElements(linkedList), "LinkedList remove");
    }

    // Метод для добавления элементов
    private static void addElements(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
    }

    // Метод для доступа к элементам (по случайным индексам)
    private static void accessElements(List<Integer> list) {
        for (int i = 0; i < list.size(); i += 1000) { // Доступ через каждые 1000 элементов
            list.get(i);
        }
    }

    // Метод для удаления элементов (из начала списка)
    private static void removeElements(List<Integer> list) {
        for (int i = 0; i < 1000; i++) { // Удаляем 1000 элементов
            list.remove(0);
        }
    }

    // Измеряем время выполнения
    private static void measureTime(Runnable action, String description) {
        long start = System.nanoTime();
        action.run();
        long end = System.nanoTime();
        System.out.println(description + " took " + (end - start) / 1_000_000 + " ms");
    }
}
