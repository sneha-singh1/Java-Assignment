//Write a Java program to remove and return the first element of a linked list
package comassingn;

import java.util.*;

public class Q14 {

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
		System.out.println("Original list: "+a);
		Collections.shuffle(a);
		System.out.println("The Linked List before removing element: "+a);
		System.out.println("The element "+a.get(0)+" was removed from the first place" );
		a.remove(0);
		System.out.println("The Linked List after removing element: "+a);
	}

}
