package h3;

public class H3_main {
	public static void main(String[] args)	{
		int i = 201;
		int j = 300;
		int k = -10;
		boolean a1 = i > j;
		boolean a2 = i > 200;
		boolean a3 = j > 100;
		
		if(a1 && !a2 && !a3)
	  k = 1;
		if(a1 && a2 && !a3)
		 k = 2;
		if(a1 && a2 && a3)
		 k = 3;
		if(!a1 && !a2 && !a3)
	  k = 4;

		
		System.out.println(k);
	}
}
