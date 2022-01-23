package week1.day2;

public class LearnLooping {
	public void printNumbers()
	{
		//Print the numbers from 1 to 100
		System.out.println("Numbers from 1 to 100 ");
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}
	}
	public void printOddNumbers()
	{
		//Print odd numbers from 1 to 100
		System.out.println("Odd numbers from 1 to 100");
				int i=1;
				while(i<=100)
				{
					if(i%2!=0)
						System.out.println(i);
					i++;
					
				}	
				
	}
	public void printSquareEvenNumbers(int start, int end)
	{
		//Print Square of even numbers from 59 to 38
		      System.out.println("Square of even numbers from 59 to 38");
				int i=start;
				while(i>=end)
				{
					if(i%2==0)
					{
						int square =i*i;
						System.out.println("Square of " + i + " is " + square);
					}
					i--;
				}					
	}

	
	public void printSum(int n)
	{
		//Print Sum of given numbers in a range
		System.out.println("Sum of given numbers in a range");
				int i=1;
				int sum = 0;
				for(;i<=n;i++)
				{
					sum=i+sum;
				}	
				System.out.println("Sum of " + n + " is " +sum);
	}
	
	
public static void main(String[] args) {
	
	LearnLooping obj1 = new LearnLooping();
	obj1.printNumbers();
	obj1.printOddNumbers();
	obj1.printSquareEvenNumbers(59, 38);
	obj1.printSum(5);
}
}
