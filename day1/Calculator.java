package week3.day1;

public class Calculator {
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public void multiple(double a,double b) 
	{
		System.out.println(a*b);
	}
	public void multiple(float a, float b)
	{
		System.out.println(a*b);
	}
	public static void main(String args[])
	{
		Calculator cal=new Calculator();
		cal.add(45,67);
		cal.add(34,89,23);
		cal.multiple(7.59, 3.53);
		cal.multiple(3.3,6.9);
	}
}
