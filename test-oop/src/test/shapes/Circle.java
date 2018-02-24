package test.shapes;

public class Circle extends Point{
	int R;
	
	
	public Circle(int x, int y, int r) {
		super(x, y);
		R = r;
	}
	
	@Override
	public void draw()
	{
		System.out.printf("Окружность: (%d, %d, %d)\n ", X, Y, R);
	}

}
