package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testAddition() {
        assertEquals(5.0, App.calculate(2, 3, '+'), 0.001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(1.0, App.calculate(3, 2, '-'), 0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, App.calculate(2, 3, '*'), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, App.calculate(6, 3, '/'), 0.001);
    }
}