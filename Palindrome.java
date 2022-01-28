package week1.day2.assignments.mandatory;

public class Palindrome {
	
	//Build a logic to find the given string is palindrome or not
    
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

	public static void main(String[] args) {
		
		String str = "madam";
		String revStr = "";
		int length = str.length();
		System.out.println("length of the string "+length);
		System.out.print("Characters are  " );
		for (int i = 0; i < length; i++) {
			char charAt = str.charAt(i);
			System.out.print(charAt + " ");
		}
		System.out.print("\nReverse String is ");
		char charAt1[] = str.toCharArray();
			for (int j = length-1; j >= 0; j--) {
				
				
			     System.out.print(charAt1[j] + " ");
			     revStr = revStr + str.charAt(j);
			     
			}
			
			if((str.equals(revStr)))
				System.out.println("Palindrome");
			else
				System.out.println("Not a Palindrome");
			
		
		
	}
	
}
