/**
 * 
 */
package com.pkp.java.basics.string;

/**
 * @author Pankaj Kumar
 *
 */
public class MyString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * String is immutable object in Java.
		 */
		String string1= "Hello";
		String delimiter = new String(", ");
		String string2 = "World";

		System.out.println("string1 = "+string1);
		System.out.println("delimiter = "+delimiter);
		System.out.println("string2 = "+string2);
		
		/**
		 * Concatenation of  string done by + operator or .concat method
		 */
		String concatUsingOperator= string1+delimiter+string2;
		String concatUsingConcatMethod = string1.concat(delimiter).concat(string2);
		
		System.out.println("Concat using operator :"+concatUsingOperator);
		System.out.println("Concat using method :"+concatUsingConcatMethod);

	}

}
