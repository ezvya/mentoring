package org.automation.course.genereic_collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GenericSetExample {

    /*
    Когда использовать Set?
    Когда важно уникальность элементов.
    Когда порядок не имеет значения (HashSet).
    Когда нужно автоматическая сортировка (TreeSet).

     */
    static Set<String> hashSet;
    static Set<String> treeSet;

    public static void main(String[] args) {
        // HashSet — не гарантирует порядок элементов
        hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Banana"); // дубликат, не добавится

        System.out.println("HashSet: " + hashSet);

        // TreeSet — хранит элементы в отсортированном порядке
        treeSet = new TreeSet<>();
        treeSet.addAll(hashSet); // Загружаем элементы из HashSet
        System.out.println("TreeSet (sorted): " + treeSet);

        // Проверка наличия элемента
        System.out.println("Contains 'Apple'? " + treeSet.contains("Apple"));

        // Удаление элемента
        treeSet.remove("Orange");
        System.out.println("After removing 'Orange': " + treeSet);
    }
}
