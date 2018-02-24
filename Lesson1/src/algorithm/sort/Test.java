package algorithm.sort;

public class Test {
	
	public static void main(String[] arg) {
		
		int[] array = {20, 6, 1, 4, 7, 8, 9, 8, 11, 67};
		sort(array);
		print(array);
	
	
	}
	
	public static void print(int[] a)
	{
		for(int i: a)
			System.out.print(i + " ");
		System.out.println();
			
	}
	
	public static void print(Integer[] a)
	{
		for(Integer i: a)
			System.out.print(i + " ");
		System.out.println();
			
	}
	
	
	public static void sort(int[] a)
	{
		int temp;
		for(int i =  a.length - 1; i > 0;  i--)
		{
			for(int j = 0; j < i; j++)
				if (a[j + 1] < a[j])
				{
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
		
				}
		
		}

	}
	
	
	
}
