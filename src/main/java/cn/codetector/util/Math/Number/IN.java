package cn.codetector.util.Math.Number;

public class IN extends Number{
    public double number;

    public IN(double number) {
        this.number = number;
    }

    @Override
    public int intValue() throws NumberEvaluationException {
        throw new NumberEvaluationException();
    }

    @Override
    public double doubleValue() throws NumberEvaluationException {
        throw new NumberEvaluationException();
    }

    @Override
    public float floatValue() throws NumberEvaluationException {
        throw new NumberEvaluationException();
    }

    @Override
    public long longValue() throws NumberEvaluationException {
        throw new NumberEvaluationException();
    }

    @Override
    public String stringValue() {
        return number+"i";
    }
}
