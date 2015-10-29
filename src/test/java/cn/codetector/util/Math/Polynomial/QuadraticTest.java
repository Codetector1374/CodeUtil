package cn.codetector.util.Math.Polynomial;

import junit.framework.TestCase;

public class QuadraticTest extends TestCase {

    public void testSolve() throws Exception {
        System.out.println(new Quadratic(1,-1,-1).solve());
    }
}