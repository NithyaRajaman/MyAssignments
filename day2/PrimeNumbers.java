package week1.day2;

public class PrimeNumbers {
	public static void main(String args[])
	{
		int input=12;
		boolean isPrime=true;
		for(int i=2; i<input;i++)
		{
			if(input%i==0)
				{
				isPrime=false;
				break;
				}
				}
		if(isPrime)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Non Prime Number");
		}
		}
}
