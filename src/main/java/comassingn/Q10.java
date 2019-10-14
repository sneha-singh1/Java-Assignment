//Write a Java program to iterate a linked list in reverse order.
package comassingn;

import java.util.*;

public class Q10 {

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
		a.add("Green");	
		System.out.println("Original list: "+a);
		s = new Scanner(System.in);
		ListIterator i = a.listIterator(a.size());
		while(i.hasPrevious()) {
		System.out.println(i.previous());
		}
	}
}
