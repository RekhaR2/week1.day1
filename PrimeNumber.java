package week1.day1.assignments;

public class PrimeNumber {
	
	// To find whether a number is a Prime number or not
	/* My learning from this code
	 * 1) Use of boolean data type
	 * 2) Modulus Operator
	 * 3) if else condition	
	 */
	public static void main(String[] args) {
		
		int input = 13;
		boolean flag = false;
		for (int i = 2; i < input/2; i++) {
		
			int j = input%i ;
			if (j == 0)
			{
				flag = true;
				break;
				
			}
		}
			if (flag == true)
				System.out.println(input + " is a Non Prime number");
			else 
				System.out.println(input + " is a Prime number");
		}    
		
	

}
