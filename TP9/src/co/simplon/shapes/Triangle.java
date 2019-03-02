package co.simplon.shapes;

public class Triangle extends Shape {
	private double base;
	private double heigth;
	
	public Triangle(double base, double heigth,int x, int y) {
		super(x, y);
		this.base = base;
		this.heigth = heigth;		
	}
	public Triangle(double base, double heigth,Point center) {
		super(center);
		this.base = base;
		this.heigth = heigth;
	}
	@Override
	public double area() {		
		return (base*heigth)/2;
	}
	@Override
	public String toString() {
		return "Triangle : base = " + base + ", heigth = " + heigth + super.toString();
	}	
}
