package cn.codetector.util.Math.Number;

public abstract class Number {
    public class NumberEvaluationException extends Exception{
        @Override
        public String getMessage() {
            return "This number can not be formatted into the selected format";
        }
    }
    abstract public int intValue() throws NumberEvaluationException;
    abstract public double doubleValue() throws NumberEvaluationException;
    abstract public float floatValue() throws NumberEvaluationException;
    abstract public long longValue() throws NumberEvaluationException;
    abstract public String stringValue();
    @Override
    public String toString() {
        return this.stringValue();
    }
}
