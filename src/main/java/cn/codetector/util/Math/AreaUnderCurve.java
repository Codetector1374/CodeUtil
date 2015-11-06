package cn.codetector.util.Math;

public class AreaUnderCurve {
    public double AreaUnderTheCurve(int n, int m){
        final double SECTION_SIZE = 0.00000001;
        double sum = 0;
        Function testFunc = new testFunction();
        for (double i = n; i <= m; i+=SECTION_SIZE){
            sum += testFunc.evaluate(i)*SECTION_SIZE;
        }
        return sum;
    }
}
class testFunction implements Function{

    @Override
    public double evaluate(double x) {
        return Math.pow(Math.E, Math.pow(x,2));
    }
}
