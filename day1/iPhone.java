package week3.day1;

public class iPhone extends iOS{
	public void makeCall() {
		System.out.println("makecall functionality");
	}
	public void sendSMS() {
		System.out.println("Send SMS functionality");
	}
	public static void main(String[] args) {
		iPhone ip=new iPhone();
		ip.makeCall();
		ip.sendSMS();
		
	}

}
