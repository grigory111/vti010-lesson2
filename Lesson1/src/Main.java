

public class Main {

	public  static void main(String[] args) {
		//System.out.println("��� ������ ���������\n");
		
	    //x^2 - 3*x + 2 = 0
		double a = 1.0;
		double b = -3.0;
		double c = 2.0;
		
		double x1, x2;
		
		double D = b* b  - 4 * a * c;
		if (D < 0)
			System.out.println("�������������� ������ ���\n");
		else if (D == 0)
		{
			x1 = b * b / (4 * a );
			System.out.println("���� ������: " + x1);
		}
		else 
		{
			x1 = (- b + Math.sqrt(D)) / (4 *a);
			x2 = (- b - Math.sqrt(D)) / (4 *a);
			
			System.out.printf("��� �����: %.2f, %.2f\n", x1, x2);

		}
		
	}

}
