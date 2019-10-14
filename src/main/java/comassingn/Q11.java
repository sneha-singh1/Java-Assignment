//Write a Java program to get the first and last occurrence of the specified elements in a linked list.
package comassingn;

import java.util.*;

public class Q11 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a = new ArrayList<String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("Blue");
		a.add("Yellow");
		a.add("Orange");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("Yellow");
		a.add("Orange");
		a.add("Blue");
		a.add("Green");	
		System.out.println("Original list: "+a);
		s = new Scanner(System.in);
		System.out.println("Enter the element whose first and last occurrence is to be found in the list.");
		String el=s.next();
		int fi = a.indexOf(el);
		int li = a.lastIndexOf(el);
		System.out.println("Fisrt occurrence is at index "+fi+" and the last occurrence is at index "+li);
	}

}
