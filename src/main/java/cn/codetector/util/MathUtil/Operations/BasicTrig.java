package cn.codetector.util.MathUtil.Operations;

public class BasicTrig {
	public static double Sine(double Value, boolean Radian){
		if(!Radian){
			Value=Math.toRadians(Value);
		}
		return Math.sin(Value);
	}
	
	public static double Cosine(double Value, boolean Radian){
		if(!Radian){
			Value=Math.toRadians(Value);
		}
		return Math.cos(Value);
	}
	
	
}
