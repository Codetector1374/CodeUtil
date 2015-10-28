package cn.codetector.util.Math.Number;

public abstract class Number {
    public class NumberEvaluationException extends Exception{
        @Override
        public String getMessage() {
            return "This number can not be formatted into the selected format";
        }
    }
    abstract public int intValue();
    abstract public double doubleValue();
    abstract public float floatValue();
    abstract public long longValue();
    abstract public String stringValue();
    @Override
    public String toString() {
        return this.stringValue();
    }
}
