package week1.day2.assignments.optional;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {


		/*
		 * Pseudo Code

		 *Declare a String 
		String text1 = "stops";
		 *Declare another String
		String text2 = "potss"; 

		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */

		String text1 = "stops";
		String text2 = "potss";
		int length1 = text1.length();
		int length2 = text2.length();
		if(length1 != length2)
		{
			System.out.println("Not Anagram");
			return;
		}
		char[] charAt1 = text1.toCharArray();
		// System.out.println("Characters of text1 is " + charAt1);
		char[] charAt2 = text2.toCharArray();
		//System.out.println("Characters of text2 is " + charAt2);
		Arrays.sort(charAt1);
		Arrays.sort(charAt2);
		System.out.println(charAt1);
		System.out.println(charAt2);

		// Array Comparison

		if(Arrays.equals(charAt1, charAt2))
			System.out.println("Equal" );
		else
			System.out.println("Not equal");

		// string comparison
		String t1 = Arrays.toString(charAt1);
		String t2 = Arrays.toString(charAt2);


		if(t1.equals(t2))
			System.out.println("Anagram" );
		else
			System.out.println("Not Anagram");

	}
}