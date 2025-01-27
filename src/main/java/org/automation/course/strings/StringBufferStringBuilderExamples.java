package org.automation.course.strings;

public class StringBufferStringBuilderExamples {

    public static void main(String[] args) {
        // StringBuilder (быстрее (в теории), но не потокобезопасно)
        StringBuilder sb = new StringBuilder("This is ");
        sb.append("an example");
        System.out.println("StringBuilder: " + sb);

        // StringBuffer (потокобезопасно)
        StringBuffer sbf = new StringBuffer("This is ");
        sbf.append("an example");
        System.out.println("StringBuffer: " + sbf);

        // Измерение производительности
        measurePerformance();
    }

    private static void measurePerformance() {
        StringBuilder sb = new StringBuilder();
        StringBuffer sbf = new StringBuffer();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        System.out.println("StringBuilder performance: " +  (System.currentTimeMillis() - start) + " ms");


        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sbf.append("a");
        }
        System.out.println("StringBuffer performance: " + (System.currentTimeMillis() - start)  + " ms");
    }
}
