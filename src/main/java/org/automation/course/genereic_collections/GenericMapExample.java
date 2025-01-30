package org.automation.course.genereic_collections;

import java.util.HashMap;
import java.util.Map;

// Дженерик-класс, работающий с парой "ключ-значение"
public class GenericMapExample<K, V> {

    private Map<K, V> map = new HashMap<>();

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public void printAll() {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }


    public static void main(String[] args) {
        // Карта пользователей (id -> имя)
        GenericMapExample<Integer, String> userMap = new GenericMapExample<>();
        userMap.put(1, "Homer");
        userMap.put(2, "Marge");
        userMap.printAll();

        // Карта цен продуктов (название -> цена)
        GenericMapExample<String, Double> priceMap = new GenericMapExample<>();
        priceMap.put("Laptop", 999.99);
        priceMap.put("Phone", 599.99);
        priceMap.printAll();

        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Marge", 35);
        ageMap.put("Liza", 9);
        ageMap.put("Bart", 11);

        System.out.println("Before removal: " + ageMap);

        // Удаление по ключу
        ageMap.remove("Bart");
        System.out.println("After removal: " + ageMap);

        // Итерация по Map
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }

    }
}