package cz.educanet;

import junit.framework.TestCase;

public class LogicTest extends TestCase {
    Logic logic = new Logic();

    public void testPlus() {
        int a = 1;
        int b = 2;

        assertEquals(3, logic.plus(a, b));
    }

    public void testMinus() {
        int a = 1;
        int b = 2;

        assertEquals(1, logic.minus(b, a));
    }

    public void testTimes() {
        int a = 5;
        int b = 4;
        assertEquals(20, logic.times(a, b));
    }

    public void testDivided() {
        int a = 10;
        int b = 2;
        assertEquals(5, logic.divided(a, b));
    }

    public void testPower() {
        int a = 5;
        int b = 2;

        assertEquals(25, logic.power(a, b));
    }

    public void testFactorial() {
        int a = 4;

        assertEquals(24, logic.factorial(a));
    }
}