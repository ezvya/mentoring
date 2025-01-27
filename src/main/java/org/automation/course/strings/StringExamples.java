package org.automation.course.strings;

import java.lang.reflect.Method;

public class StringExamples implements StringProcessor {


    static Method getMethodName (Class<?> clazz) {
        try {
             return clazz.getDeclaredMethod("process");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    static String str1 = "Rust Cole";
    static String str2 = "Rust Cole";
    static String str3 = new String("Rust Cole");

    @Override
    public void process() {
        System.out.println("Base method");
    }


    static class StringEqualityTest implements StringProcessor {
        Class<?> clazz = StringEqualityTest.class;
        @Override
        public void process() {
            // Сравнение строк
            System.out.println("================== Method called: " + getMethodName(clazz) + " ==================");
            System.out.println("str1 == str2: " + (str1 == str2)); // true (пул строк)
            System.out.println("str1 == str3: " + (str1 == str3)); // false (разные объекты)
            System.out.println("str1.equals(str3): " + str1.equals(str3)); // true (значения равны)
        }
    }

    static class UpperCaseProcessor implements StringProcessor {
        Class<?> clazz = UpperCaseProcessor.class;
        @Override
        public void process() {
            System.out.println("================== Method called: " + getMethodName(clazz) + " ==================");
            System.out.println("This is ");
            System.out.println(str1.toUpperCase());
        }
    }

    static class StringConcat implements StringProcessor {
        Class<?> clazz = StringConcat.class;
        @Override
        public void process() {
            System.out.println("================== Method called: " + getMethodName(clazz) + " ==================");
            str1.concat(" is a Detective");
            String str4 = str1.concat(" is a Detective");
            System.out.println("Original: " + str1); // Rust Cole
            System.out.println("Modified: " + str4);// Rust Cole is a Detective
        }
    }

    static class StringBuilderTest implements StringProcessor {
        Class<?> clazz =  StringBuilderTest.class;
        @Override
        public void process() {
            System.out.println("================== Method called: " + getMethodName(clazz) + " ==================");
            StringBuilder sb = new StringBuilder("Mutable String");
            sb.append(" Example");
            System.out.println("StringBuilder: " + sb);
        }
    }

    public static void main(String[] args) {

        StringProcessor[] processors = {
                new StringEqualityTest(),
                new UpperCaseProcessor(),
                new StringConcat(),
                new StringBuilderTest()
        };

        for (StringProcessor processor : processors) {
            processor.process();
        }
    }

}
