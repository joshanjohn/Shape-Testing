/*
 * Name: Joshan John
 * Student No: 3093883
 */
package griffith;

public class Rhombus extends Shape {
	private double sideOne, sideTwo;

	public Rhombus(String name, double sideOne, double sideTwo) {
		super(name);
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;

	}

	// getter for sideOne
	public double getsideOne() {
		return sideOne;
	}

	// setter for sideOne
	public void setsideOne(double sideOne) {
		this.sideOne = sideOne;
	}

	// getter for sideTwo
	public double getsideTwo() {
		return sideTwo;
	}

	// setter for sideTwo
	public void setsideTwo(double sideTwo) {
		this.sideTwo = sideTwo;
	}

	// OVERRIDE METHODS
	@Override
	double area() {
		return sideOne * sideTwo / 2;
	}

	@Override
	double perimeter() {
		return 2 * (sideOne + sideTwo);
	}

	@Override
	public String toString() {
		return "Rhombus: " + getName() + ", Side1: " + sideOne + ", Side2: " + sideTwo;
	}

}
