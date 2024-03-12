/*
 * Name: Joshan John
 * Student No: 3093883
 */
package griffith;

public class RightAngledTriangle extends Shape {

	private double height, base;

	// getter for base
	public double getBase() {
		return base;
	}

	//setter for base
	public void setBase(double base) {
		this.base = base;
	}

	// getter for height

	public double getHeight() {
		return height;
	}

	//setter for height
	public void setHeight(double height) {
		this.height = height;
	}

	//constructor for RightAngledTriangle
	public RightAngledTriangle(String name, double height, double base) {
		super(name);
		this.base = base;
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	// OVERRIDE METHODS

	@Override
	double area() {
		return base * height / 2;
	}

	@Override
	double perimeter() {
		return base + height + Math.sqrt(base * base + height * height);
	}

	@Override
	public String toString(){
		return "RightAngledTriangle: " + getName() + ", Base: " + base + ", Height: " + height;
	}

}
