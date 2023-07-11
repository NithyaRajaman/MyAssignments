package week1.day2;

public class Calculator {
	public int addNumbers(int a, int b, int c)
	{
		return a+b+c;
	}
	public float subNumbers(int x, float y)
	{
		return x-y;
		
	}
	public float divNumbers(int m,float n)
	{
		return m/n;
		
	}

	public static void main(String[] args)
	{
		Calculator cal=new Calculator();
		System.out.println(cal.addNumbers(3,9,7));
		System.out.println(cal.subNumbers(10,4.9f));
		System.out.println(cal.divNumbers(20,10.2f));
		
	}

}
