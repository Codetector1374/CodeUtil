package cn.codetector.util.Math.Number;

public class Complex extends Number {
    private RealNumber realPart = null;
    private ImaginaryNumebr rationalPart = null;
    public Complex(double real){

    }
    public Complex(double real, ImaginaryNumebr ImaginaryNumebr){

    }
    public Complex(ImaginaryNumebr ImaginaryNumebr){

    }
    public enum ComplexType{
        RealOnly, ImaginaryOnly, BOTH, UnDefined
    }

    public ComplexType getType(){
        if (this.realPart != null && this.rationalPart != null){
            return ComplexType.BOTH;
        }else if (this.realPart != null){
            return ComplexType.RealOnly;
        }else if (this.rationalPart != null){
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
        return "";
    }
}
