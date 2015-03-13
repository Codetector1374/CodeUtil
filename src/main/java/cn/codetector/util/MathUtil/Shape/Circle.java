package cn.codetector.util.MathUtil.Shape;

public class Circle {
	private double Radius;
	private double Diameter;
	public Circle(float Radius){
		this.Radius = Radius;
		this.Diameter = Radius*2;
	}
	
	public float GetDiameter()
	{
		return (float)this.Diameter;
	}
	public float GetDiameterF(){
		return (float)this.Diameter;
	}
	
	public int GetDiameterInt(){
		return (int)this.Diameter;
	}
	
	public void SetDiameter(float Diameter){
		this.Diameter = Diameter;
	}
	
	public double GetRadius(){
		return this.Radius;
	}
	
	public float GetRadiusF(){
		return (float)this.Radius;
	}
	
	public int GetRadiusInt(){
		return (int)this.Radius;
	}
	
	public void SetRadius(float Radius){
		this.Radius = Radius;
	}
	
	public double GetSurface(){
		return (this.Radius*Math.PI*this.Radius);
	}
	
	public float GetSurfaceF(){
		return (float)this.GetSurface();
	}
	public int GetSurfactI(){
		return (int)this.GetSurface();
	}
}
