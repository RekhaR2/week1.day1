package week1.day1;

public class Student {

	String name = "S.Rekha";
	int rollNumber = 25;
	public void College()
	{
		String collegeName = "MEC";
		System.out.println("College Name       : "+ collegeName);

	}
	void printDeptName(String name)
	{
		System.out.println("Department         : "+name);
	}
	private long getRegNumber()
	{
		long regNumber = 61002205029L;
		return regNumber;
	}
	public static void main(String[] args)
	{
		Student object1 = new Student();
		System.out.println("              My College details             ");
		System.out.println("             --------------------");
		System.out.println("Name               : "+ object1.name);
		System.out.println("Roll Number        : "+ object1.rollNumber);;
		object1.College();
		object1.printDeptName("IT");
		long regNum = object1.getRegNumber();
		System.out.println("Registration Number: "+regNum);

	}
}
