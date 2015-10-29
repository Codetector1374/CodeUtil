package cn.codetector.util.Math.Number;

public class Complex extends Number {
    private RealNumber realPart = null;
    private IN imaginaryPart = null;
    public Complex(double real){
        this.realPart = new RealNumber(real);
    }
    public Complex(double real, IN IN){
        this.realPart = new RealNumber(real);
        this.imaginaryPart = IN;
    }
    public Complex(IN IN){
        this.imaginaryPart = IN;
    }
    public Complex(double real, double imaginary){
        this.realPart = new RealNumber(real);
        this.imaginaryPart = new IN(imaginary);
    }
    public enum ComplexType{
        RealOnly, ImaginaryOnly, BOTH, UnDefined
    }

    public ComplexType getType(){
        if (this.realPart != null && this.imaginaryPart != null){
            return ComplexType.BOTH;
        }else if (this.realPart != null){
            return ComplexType.RealOnly;
        }else if (this.imaginaryPart != null){
            return ComplexType.ImaginaryOnly;
        }else{
            return ComplexType.UnDefined;
        }
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public String stringValue() {
        if (getType() == ComplexType.ImaginaryOnly)
            return this.imaginaryPart.toString();
        if (getType() == ComplexType.RealOnly)
            return this.realPart.toString();
        if (this.imaginaryPart.number>0){
            return this.realPart.toString() + " + " + this.imaginaryPart.toString();
        }else{
            return this.realPart.toString() + this.imaginaryPart.toString();
        }
    }
}
