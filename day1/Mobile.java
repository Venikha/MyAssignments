package week1.day1;

public class Mobile {
	
	public void makeCall() {
	System.out.println("Hi");
	String mobileModel="Vivo";
	float mobileWeight=5.5f;
	System.out.println(mobileWeight);
	System.out.println(mobileModel);
	}
	public void sendMsg() {
	System.out.println("Hello All");
	boolean isFullyCharged=true;
	int mobileCost=10000;
	System.out.println(isFullyCharged);
	System.out.println(mobileCost);
	}

	public static void main(String[] args) {
	Mobile mob1 = new Mobile ();
	mob1.makeCall();
	mob1.sendMsg();
	System.out.println("This is my mobile");
	}

}
