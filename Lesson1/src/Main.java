

public class Main {

	public  static void main(String[] args) {
		//System.out.println("Моя первая программа\n");
		
	    //x^2 - 3*x + 2 = 0
		double a = 1.0;
		double b = -3.0;
		double c = 2.0;
		
		double x1, x2;
		
		double D = b* b  - 4 * a * c;
		if (D < 0)
			System.out.println("Действительных корней нет\n");
		else if (D == 0)
		{
			x1 = b * b / (4 * a );
			System.out.println("Один корень: " + x1);
		}
		else 
		{
			x1 = (- b + Math.sqrt(D)) / (4 *a);
			x2 = (- b - Math.sqrt(D)) / (4 *a);
			
			System.out.printf("Два корня: %.2f, %.2f\n", x1, x2);

		}
		
	}

}
