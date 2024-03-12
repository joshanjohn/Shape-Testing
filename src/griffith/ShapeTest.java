package griffith;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeTest {
	private static final double DELTA = 0;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCircle() {
		Circle circle = new Circle("CircleOne", 10); // Circle object

		double expectedArea = 314.1592653589793; // expected value for area of given circle
		double expectedPerimeter = 62.83185307179586; // expected value for perimeter of given circle
		// expected value for toString method of given circle object
		String expectedToString = "Circle: CircleOne, Radius: 10.0";

		// testing area() method of Circle
		assertEquals(expectedArea, circle.area(), DELTA);
		// testing perimeter() method of Circle
		assertEquals(expectedPerimeter, circle.perimeter(), DELTA);
		// testing toString() method of Circle
		assertEquals(expectedToString, circle.toString());

	}

	@Test
	void testRhombus() {
		Rhombus rhombus = new Rhombus("RhombusTen", 10, 10); // Rhombus object

		double expectedArea = 50.0; // expected value for area of given rhombus
		double expectedPerimeter = 40.0; // expected value for perimeter of given rhombus
		// expected value for toString method of given rhombus object
		String expectedToString = "Rhombus: RhombusTen, Side1: 10.0, Side2: 10.0";

		// testing area() method of Rhombus
		assertEquals(expectedArea, rhombus.area(), DELTA);
		// testing perimeter() method of Rhombus
		assertEquals(expectedPerimeter, rhombus.perimeter(), DELTA);
		// testing toString() method of Rhombus
		assertEquals(expectedToString, rhombus.toString());
	}

	@Test
	void testRightAngledTriangle() {
		RightAngledTriangle triangle = new RightAngledTriangle("RhombusTen", 10, 10); // RightAngledTriangle object

		double expectedArea = 50.0; // expected value for area of given triangle
		double expectedPerimeter = 34.14213562373095; // expected value for perimeter of given triangle
		// expected value for toString method of given triangle object
		String expectedToString = "RightAngledTriangle: RhombusTen, Base: 10.0, Height: 10.0";

		// testing area() method of RightAngledTriangle
		assertEquals(expectedArea, triangle.area(), DELTA);
		// testing perimeter() method of RightAngledTriangle
		assertEquals(expectedPerimeter, triangle.perimeter(), DELTA);
		// testing toString() method of RightAngledTriangle
		assertEquals(expectedToString, triangle.toString());
	}

	@Test
	public void testIntegration() {
		ArrayList<Shape> shapes = new ArrayList<>();

		shapes.add(new Circle("Circle1", 3.5));
		shapes.add(new Circle("Circle2", 4.0));

		shapes.add(new Rhombus("Rhombus1", 4.0, 3.0));
		shapes.add(new Rhombus("Rhombus2", 5.0, 4.0));

		shapes.add(new RightAngledTriangle("Triangle1", 4.0, 3.0));
		shapes.add(new RightAngledTriangle("Triangle2", 5.0, 12.0));

		for (Shape shape : shapes) {
			assertEquals(shape.area(), shape.area(), 0.0);
			assertEquals(shape.perimeter(), shape.perimeter(), 0.0);
		}
	}

}
