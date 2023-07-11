package week3.day1;

public class iOS {
	public void startApp()
	{
		System.out.println("Startapp functionality");
	}
	public void increaseVolume()
	{
		System.out.println("increase volume functionality");
	}
	public void shutDown() {
		System.out.println("shut down functionality");
	}
public static void main(String args[])
{
	iOS apple=new iOS();
	apple.startApp();
	apple.increaseVolume();
	apple.shutDown();
}
}
