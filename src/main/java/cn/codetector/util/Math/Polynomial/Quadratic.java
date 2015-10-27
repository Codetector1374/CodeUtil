package cn.codetector.util.Math.Polynomial;

/**
 * @author Codetector
 * @see cn.codetector.util.Math.Polynomial.Polynomial
 */
public class Quadratic extends Polynomial {

    /**
     * ABC
     */
    public double a, b, c;
    private boolean Init = false;

    /**
     * @param a -- A
     * @param b -- B
     * @param c -- C
     */
    public Quadratic(double a, double b, double c) {
        super(2);
        this.a = a;
        this.b = b;
        this.c = c;
        this.Init = true;
    }

    public Quadratic.Type getPolynomialType() throws UnSetABCException {
        if (!this.Init) {
            throw new UnSetABCException();
        } else {
            double discriminant = b * b - 4 * a * c;
            if (discriminant>0){
                return Type.TwoRealRoots;
            }else if(discriminant==0){
                return Type.OneRealRoot;
            }else{
                return Type.NoRealRoot;
            }
        }
    }

    public enum Type {
        NoRealRoot, OneRealRoot, TwoRealRoots
    }

    public class UnSetABCException extends Exception {
        @Override
        public String getMessage() {
            return "ABC NOT FULLY SET";
        }
    }

}
