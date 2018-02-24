package test.shapes;

public class Point implements Shapes{
	int X;
	int Y;
	
	
	public Point(int x, int y) {
		super();
		X = x;
		Y = y;
	}


	@Override
	public void draw() {
		System.out.printf("Точка: (%d, %d)\n ", X, Y);
	}

	
	@Override
	public void move(int dx, int dy) {
		X += dx;
		Y += dy;
	}
	
	
	
}
