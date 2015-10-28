package cn.codetector.util.Math.Number;

public class RealNumber extends Number {
    private double real;
    @Override
    public int intValue() {
        return (int)this.real;
    }

    @Override
    public double doubleValue() {
        return this.real;
    }

    @Override
    public float floatValue() {
        return (float)this.real;
    }

    @Override
    public long longValue() {
        return (long)this.real;
    }

    @Override
    public String stringValue() {
        return String.valueOf(this.real);
    }
    public RealNumber(double realNumber){
        this.real = realNumber;
    }
    public void updateValue(double newValue){
        this.real = newValue;
    }
}
