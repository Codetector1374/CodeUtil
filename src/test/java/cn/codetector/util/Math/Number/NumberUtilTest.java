package cn.codetector.util.Math.Number;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NumberUtilTest extends TestCase {

    @Test
    public void testIsPrime() throws Exception {
        assertTrue(NumberUtil.isPrime(2));
        assertTrue(NumberUtil.isPrime(3));
        assertTrue(NumberUtil.isPrime(5));
        assertTrue(NumberUtil.isPrime(7));
        assertTrue(NumberUtil.isPrime(11));
        assertTrue(NumberUtil.isPrime(13));
        assertFalse(NumberUtil.isPrime(4));
        assertFalse(NumberUtil.isPrime(6));
        assertFalse(NumberUtil.isPrime(8));
    }
    @Test
    public void testIsOdd() throws Exception {
        assertTrue(NumberUtil.isOdd(1));
        assertTrue(NumberUtil.isOdd(3));
        assertTrue(NumberUtil.isOdd(5));
        assertTrue(NumberUtil.isOdd(7));
        assertFalse(NumberUtil.isOdd(4));
        assertFalse(NumberUtil.isOdd(2));
        assertFalse(NumberUtil.isOdd(10));
        assertFalse(NumberUtil.isOdd(877233662));
        assertFalse(NumberUtil.isOdd(727467672));
    }
}