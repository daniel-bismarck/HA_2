package h2;

public class H2_main {
	public static void main(String[] args)	{
		int i = 1;
		int j = 2;
		int k = 3;
		int min = 0;
		int max = 0;
		
		if(GetBigger(i,j) > k)
			max = GetBigger(i,j);
		else
			max = k;
		
		if(GetSmaller(i,j) < k)
			min = GetSmaller(i,j);
		else
			min = k;
		
		System.out.println("min: " + min + ", max: " + max);
	}
	
	
	private static int GetBigger(int a, int b)	{
		if(a > b)
			return a;
		else
			return b;
	}
	
	private static int GetSmaller(int a, int b)	{
		if(a < b)
			return a;
		else
			return b;
	}
}
