package cn.codetector.util.Math.Polynomial;

import junit.framework.TestCase;

public class QuadraticTest extends TestCase {

    public void testSolve() throws Exception {
        QuadraticSolution solution = new Quadratic(1,2,-3).solve();
        assertEquals(1.0,solution.toArray()[0]);
        assertEquals(-3.0,solution.toArray()[1]);
    }
}