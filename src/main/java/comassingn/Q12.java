//Write a Java program to retrieve but does not remove, the last element of a linked list.
package comassingn;

import java.util.*;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a = new ArrayList<String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("Orange");
		a.add("Green");	
		a.add("Blue");
		a.add("Yellow");
		a.add("Orange");
		a.add("Green");	
		System.out.println("Original list: "+a);
		Collections.shuffle(a);
		int index = a.size();
		String el = a.get(index-1);
		System.out.printf("The element at last index is %s ",el);
	}

}
