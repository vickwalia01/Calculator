package PracticeWorks;

public class StringIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1: Write s java program to compare two strings, ignoring case differences.
		 * 2:Write a java program to concantenate a given string to the end of another string
		 * 3: Write a java program to get the length of a given string
		 * 4: Write a java progra, to get a substring of a given string between two specified positions
		 * 5: Write a java program to convert all the characters in a string to uppercase
		 * 6: Write a java program to covert all the characters in a string to lowercase
		 */
		
		String s= "Welcome to";
		String s1= "The greatest City in the world";
		      
		System.out.println(s.equalsIgnoreCase("WELCOME TO"));
		System.out.println(s1.equalsIgnoreCase("THE GREATEST CITY IN THE WORLD"));
	    System.out.println(s.concat(s1));
		System.out.println(s.length());
		System.out.println(s1.substring(0,8));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		
		
	}

}
