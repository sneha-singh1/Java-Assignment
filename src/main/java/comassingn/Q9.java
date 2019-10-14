//Write a Java program to iterate through all elements in a linked list starting at the specified position
package comassingn;

import java.util.*;

public class Q9 {

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
		System.out.println("Enter index from which iteration is to be started.");
		int print = s.nextInt();
		ListIterator<String> i = a.listIterator(print);
		while(i.hasNext()) 
		{
		System.out.println(i.next());	
		}
	}

}
