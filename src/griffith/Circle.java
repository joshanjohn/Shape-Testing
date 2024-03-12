/*
 * Name: Joshan John
 * Student No: 3093883
 */
package griffith;

public class Circle extends Shape {
	private double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// OVERRIDE METHODS
	@Override
	double area() {
		return Math.PI * radius * radius;
	}

	@Override
	double perimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
    public String toString() {
        return "Circle: " + getName() + ", Radius: " + radius;
    }

}
