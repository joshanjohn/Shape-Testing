/*
 * Name: Joshan John
 * Student No: 3093883
 */
package griffith;

public abstract class Shape {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Shape(String name) {
		this.name = name;
	}

	abstract double area();

	abstract double perimeter();


	public String toString(){
		return this.getName();
	}

}
