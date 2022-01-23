package week1.day1.classroom;

public class Factorial {
	public static void main(String[] args) {
		//Find the Factorial of a given number
		/* Learning from this code
		 * 1) For loop concept
		 * 2) increment and decrement
		 * 3) while loop 
		 */
		
		int input = 5;
		int fact =1;
		for (int i = 1; i<=input; i++) {
			fact = fact * i;
			}
		System.out.print("Factorial of ");
		/*for(int j=5;j>=1;j--)
		{
		    System.out.print(j + "*");
		   
		}*/
		int j=5;
		while(j>=1)
		{
			System.out.print(j + "*");
			j--;
		}
		System.out.println(" is "+ fact);
	}

}
