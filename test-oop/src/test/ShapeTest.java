package test;

import test.shapes.Circle;
import test.shapes.Point;

public class ShapeTest {

	public static void main(String[] args) {
		
		Point p = new Point(1, 1);
		p.move(1, 1);
		p.move(1, 1);
		p.draw();
		
		Circle c = new Circle(1, 1, 10);
		c.move(1, 1);
		c.draw();
	}

}
