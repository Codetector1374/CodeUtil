package cn.codetector.util.Graph.Color;

public class Color3 {
	public float Red;
	public float Green;
	public float Blue;
	public int Hex;
	
	/**
	 * Create Color3 with RGB and Hex
	 * @param R - Red Color(0-1)
	 * @param G - Green Color(0-1)
	 * @param B - Blue Color(0-1)
	 * @param H - Hex Color (0x000000 - 0xFFFFFF)
	 */
	public Color3(float R, float G, float B, int H){
		Red = R;
		Green = G;
		Blue = B;
		Hex = H;
	}
	/**
	 * Create a Color3 with a hex only
	 * 
	 * @param hex
	 */
	public Color3(int hex){
		int r = (hex & 0xFF0000) >> 16;
	    int g = (hex & 0xFF00) >> 8;
	    int b = (hex & 0xFF);
	    float red = r/255.0f;
	    float green = g/255.0f;
	    float blue = b/255.0f;
	    this.Red = red;
	    this.Blue = blue;
	    this.Green = green;
	    this.Hex = hex;
	}
	/**
	 * @deprecated
	 * 
	 * Return Color3
	 * 
	 * @param hex The Hex value of the color
	 * @return
	 */
	public static Color3 CreateWithHex(int hex){
		int r = (hex & 0xFF0000) >> 16;
	    int g = (hex & 0xFF00) >> 8;
	    int b = (hex & 0xFF);
	    float red = r/255.0f;
	    float green = g/255.0f;
	    float blue = b/255.0f;
	    return new Color3(red,green,blue,hex);
	}
	
	public String ToString(){
		return "R:" + Red +" ,G:" +Green + " ,B:" +Blue;
	}
	
}
