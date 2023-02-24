package org.example.chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;



@RunWith(value = Parameterized.class)
public class ParameterizedTest {

    private double expected;
    private double valueOne;
    private double valueTwo;


    @Parameterized.Parameters
    public static Collection<double[]> getTestParameters() {
        return Arrays.asList(new double[][]{
                        {2, 1, 1}, // 예상 값, 값1, 값2
                        {3, 2, 1}, // 예상 값, 값1, 값2
                        {4, 3, 1}  // 예상 값, 값1, 값2
        });
    }

    public ParameterizedTest(double expected,
                             double valueOne,
                             double valueTwo) {
        this.expected = expected;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    @Test
    public void sum() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(expected, calc.add(valueOne, valueTwo));
    }
}