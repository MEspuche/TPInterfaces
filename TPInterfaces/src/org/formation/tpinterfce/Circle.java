package org.formation.tpinterfce;


public class Circle implements Surface, Message, IPrintable {

	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	public double getArea()
	{
		double area = Math.PI* this.radius *this.radius;
		return area;
	}
	
	public String getMessage()
	{
		return "c'est un cercle";
	}
	
	public void printMe()
	{
		System.out.println("Circle [radius=" + this.radius + "]");
	}
}

