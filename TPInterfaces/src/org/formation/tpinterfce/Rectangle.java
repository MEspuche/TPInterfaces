package org.formation.tpinterfce;

public class Rectangle implements Surface {

	
	private double width;
	private double height;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	public Rectangle() {
		super();
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	public double getArea()
	{
		double area = this.width * this.height;
		return area;
	}
}
