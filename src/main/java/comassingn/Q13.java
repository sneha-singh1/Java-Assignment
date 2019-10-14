//Write a Java program to convert a linked list to array list.
package comassingn;

import java.util.*;

public class Q13 {

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
		List<String> al = new ArrayList<String>(a);
		System.out.println("The Linked List is: "+a);
		System.out.println("The Array List is: "+al);
	}

}
