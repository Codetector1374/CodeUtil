package cn.codetector.util.Graphics.Vector;

public class Vec3 {
	private float X;
	private float Y;
	private float Z;
	public Vec3(float x, float y, float z){
		X = x;
		Y = y;
		Z = z;
	}
	
	public float GetX(){
		return X;
	}
	public float GetY(){
		return Y;
	}
	public float GetZ(){
		return Z;
	}
	public void SetX(float x){
		X = x;
	}
	public void SetY(float y){
		Y = y;
	}
	public void SetZ(float z){
		this.Z = z;
	}
	public String toString(){
		return X + " , "+ Y;
	}
}
