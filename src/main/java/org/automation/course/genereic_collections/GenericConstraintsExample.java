package org.automation.course.genereic_collections;

import java.util.List;

public class GenericConstraintsExample <T extends Number>{
    private List<T> numbers;

    public GenericConstraintsExample(List<T> numbers) {
        this.numbers = numbers;
    }

    public double sum() {
        double sum = 0;
        for (T num : numbers) {
            sum += num.doubleValue(); // Безопасное преобразование
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<Long> longList = List.of(5L, 6L, 7L, 8L, 9L);
        GenericConstraintsExample<Integer> intProcessor = new GenericConstraintsExample<>(intList);
        GenericConstraintsExample<Long> longProcessor = new GenericConstraintsExample<>(longList);
        System.out.println("Sum: " + intProcessor.sum());
        System.out.println("Sum: " + longProcessor.sum());
    }
}