package week1.day1;

public class Mobile {
	// Program No 3  "Creating class Mobile and Call all the methods"
	String contactName = "Rekha";
	public void sendMsg()
	{
		System.out.print(" Welcome to TestLeaf");
	}
	private long makeCall()
	{
		long mobileNumber = 9876543210L;
		return mobileNumber;
	}
	void saveContact(String name)
	{
		System.out.println("Name "+name);
	}
	public static void main(String[] args) {
		Mobile obj2 = new Mobile();
		obj2.saveContact(obj2.contactName);
		long number = obj2.makeCall();
		System.out.println("Mobile number "+number);
		System.out.print("Hi "+obj2.contactName);
		obj2.sendMsg();


	}

}

