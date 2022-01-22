package week1.day1;

public class Mobile {
	// Program No 3  "Creating class Mobile and Calling all the methods"
	//String contactName = "Rekha";
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
		String contactName = "Rekha";//Local Variable
		Mobile obj2 = new Mobile();
		obj2.saveContact(contactName);
		long number = obj2.makeCall();
		System.out.println("Mobile number "+number);
		System.out.print("Hi "+contactName);
		obj2.sendMsg();


	}

}

