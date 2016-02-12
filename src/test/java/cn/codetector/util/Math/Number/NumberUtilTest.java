package cn.codetector.util.Math.Number;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NumberUtilTest extends TestCase {

    @Test
    public void testGeneratePrimeList(){
        int set = 0;
        List<Integer> numbers =  new ArrayList<>();
        numbers.add(2);
        for (int i = 3; set < 20; i+=2){
            if (NumberUtil.isPrime(i)){
                numbers.add(i);
                if(NumberUtil.isPrime(i-2)){
                    set++;
                    System.out.println("pair: "+i+" and "+(i-2));
                }
            }
        }
    }

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

    public void testIsOdd() throws Exception {
        assertTrue(NumberUtil.isOdd(1));
        assertTrue(NumberUtil.isOdd(3));
        assertTrue(NumberUtil.isOdd(5));
        assertTrue(NumberUtil.isOdd(7));
    }
}