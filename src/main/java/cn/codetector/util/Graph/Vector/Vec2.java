package cn.codetector.util.Graph.Vector;

public class Vec2 {
	public float X;
	public float Y;
	public Vec2(float x, float y){
		X = x;
		Y = y;
	}
	
	public float GetX(){
		return X;
	}
	public float GetY(){
		return Y;
	}
	public int GetWidthi(){
		return (int)X;
	}
	public int GetHeighti(){
		return (int)Y;
	}
	public float GetWidthf(){
		return X;
	}
	public float GetHeightf(){
		return Y;
	}
	public void SetX(float x){
		X = x;
	}
	public void SetY(float y){
		Y = y;
	}
	public String toString(){
		return X + " , "+ Y;
	}
    public Vec2 Multiply(int number){
        return new Vec2(this.X*number,this.Y*number);
    }
    public Vec2 Add(Vec2 v){
        return new Vec2(this.X +v.GetX(), this.Y +v.GetY());
    }
}