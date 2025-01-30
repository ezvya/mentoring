package org.automation.course.genereic_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
В Java значок <> в названии класса (или метода) означает, что этот класс или метод является дженерик-классом/методом (обобщённым).
Дженерики позволяют создавать классы и методы, которые работают с разными типами данных, не теряя при этом типобезопасность.

Буквы вместо конкретных типов выбраны в соответствии с общепринятым соглашением, в котором:

-T (Type) — универсальный тип.
-E (Element) — используется в коллекциях (List<E>, Set<E>).
-K и V (Key, Value) — используются в Map<K, V>.
-N (Number) — если ожидаются только числа.
-S, U, V — дополнительные типы, если требуется больше дженериков.
 */

// Дженерик-класс, работающий с любым типом T и списком (List)
public class GenericListExample<T> {

    private List<T> elements = new ArrayList<>();

    public void add(T element) {
        elements.add(element);
    }

    public T get(int index) {
        return elements.get(index);
    }

    public void printAll() {
        for (T element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Список строк
        GenericListExample<String> stringList = new GenericListExample<>();
        stringList.add("Hello");
        stringList.add("Java");
        stringList.printAll();

        // Список чисел
        GenericListExample<Integer> intList = new GenericListExample<>();
        intList.add(100);
        intList.add(200);
        intList.printAll();

        List<String> names = new ArrayList<>();
        names.add("Marge");
        names.add("Bart");
        names.add("Liza");

        System.out.println("Before sorting: " + names);

        // Сортировка списка
        Collections.sort(names);
        System.out.println("After sorting: " + names);

        // Удаление элемента
        names.remove("Bart");
        System.out.println("After removing Bart: " + names);

    }
}
