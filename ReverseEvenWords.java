package week1.day2.assignments.mandatory;

public class ReverseEvenWords {

	public static void main(String[] args) {


		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)



		/* Pseudo Code:

		 * Declare the input as Follow
      		String test = "I am a software tester"; 
	a) split the words and have it in an array
	b) Traverse through each word (using loop)
	c) find the odd index within the loop (use mod operator)

	d)split the words and have it in an array

	e)print the even position words in reverse order using another loop (nested loop)
	f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).


		 */
		ReverseEvenWords ob1 = new ReverseEvenWords();
		String test = "I am a software tester"; 
		String[] words = test.split(" ");

		for (int i = 0; i < words.length; i++) {
						
			if (i%2!=0)
			{
				
				System.out.print(" " + ob1.reverse(words[i]));
			
			} 
			else
			{
				System.out.print(" " +words[i]);
			}
			
		}
	} 

	public String reverse(String str)
	{
		char[] charArray = str.toCharArray();
		String revStr = "";
		for (int i = charArray.length-1; i >= 0; i--) {
			revStr = revStr + charArray[i];
		}

		
		return revStr;

	}

}
