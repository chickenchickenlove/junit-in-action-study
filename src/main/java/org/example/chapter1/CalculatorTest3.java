package org.example.chapter1;

public class CalculatorTest3 {

    private int failCount = 0;

    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        if (result != 60) {
            throw new IllegalStateException("Bad result : " + result);
        }
    }

    public static void main(String[] args) {

        CalculatorTest3 test = new CalculatorTest3();
        try {
            test.testAdd();
        } catch (IllegalStateException e) {
            test.failCount++;
            e.printStackTrace();
        }

        if (test.failCount > 0) {
            throw new IllegalStateException("There were" + test.failCount + " error(s)");
        }
    }
}
