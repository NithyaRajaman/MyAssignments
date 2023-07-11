package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int x=0;
		int y=1;
		System.out.println(x + " " + y);
		for(int i=2;i<10;i++)
		{
		int z=x+y;
		System.out.println("the fibonacci series is   " + z);
		x=y;
		y=z;
	
		}
	}

}
