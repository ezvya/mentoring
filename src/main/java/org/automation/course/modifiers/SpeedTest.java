package org.automation.course.modifiers;

//замер скорости работы статических и обычных методов
public class SpeedTest {
    private static int staticCounter = 0;
    private int instanceCounter = 0;

    private static final int finalValue = 42;
    private int nonFinalValue = 42;

    public int getFinalValue() {
        return finalValue;
    }

    public int getNonFinalValue() {
        return nonFinalValue;
    }

    public static void incrementStaticCounter() {
        staticCounter++;
    }

    public void incrementInstanceCounter() {
        instanceCounter++;
    }

    public static void main(String[] args) {

        SpeedTest example = new SpeedTest();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000_000; i++) {
            example.incrementInstanceCounter();
        }
        System.out.println("Instance method time: " + (System.currentTimeMillis() - start)  + " ms");
        System.out.println(example.instanceCounter);


        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000_000; i++) {
            incrementStaticCounter();
        }
        System.out.println("Static method time: " + (System.currentTimeMillis() - start)  + " ms");
        System.out.println(staticCounter);

        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            example.getFinalValue();
        }
        System.out.println("Final method time: " + (System.currentTimeMillis() - start)  + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            example.getNonFinalValue();
        }
        long end = System.currentTimeMillis();
        System.out.println("Non-final method time: " + (end - start)  + " ms");

    }
}
