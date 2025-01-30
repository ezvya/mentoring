package org.automation.course.modifiers;

import java.util.ArrayList;
import java.util.List;

public class ModifiersExample {

    /*
    Значение переменной не должно изменяться: final
    Метод или переменная должны быть общими для всех объектов: static
    Класс или метод не должны изменяться (Для предотвращения наследования или переопределения): final
    Метод не использует состояние объекта (Для независимых методов): static
    Инициализация статических данных через блок (Для сложной инициализации общих данных): static
     */

    /*
    Static поле (общее для всех объектов)
    сочетание static final отлично подходит для создания констант, хранящих пути к файлам, часто используемые
    строковые значения и проч
     */
    public static final String APPLICATION_NAME = "TestProject";
    public static final List<String> list = new ArrayList<>();

    // Final поле (значение устанавливается один раз)
    public final int id;

    final class BaseClass {
        BaseClass() {
            System.out.println("Final class example");
        }
    }

//    нельзя наследоваться от final класса
//    class Child extends BaseClass{
//
//    }

    // Static метод
    public static void printAppName() {
        System.out.println("Application Name: " + APPLICATION_NAME);
    }

    // Конструктор
    public ModifiersExample(int id) {
        this.id = id;
    }

    public void printDetails() {
        System.out.println("Instance ID: " + id);
    }

    static class Example extends ModifiersExample {
        public Example() {
            super(1);
            //пример вызова через ссылку (избыточный) и напрямую
            this.printAppName();
            printAppName();
        }
    }

    public static void main(String[] args) {
        Example example = new Example();
//        нельзя назначить новое значение финальной переменной
//        example.id = 5;
        list.forEach(System.out::println);

    }
}