package org.tektuor;

//This type of class is called as Data Class or POJO
public class Color {
	
	private int red, green, blue;
	
	//Default constructor
	public Color() {
	}
	
	//Overloaded constructor
	public Color(int red, int green, int blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}
	
	

}
