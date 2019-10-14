//Write a Java program to append the specified element to the end of a linked list.
package comassingn;

import java.util.*;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("Blue");
		a.add("Yellow");
		a.add("Orange");
		a.add("Green");	
		System.out.println("Original list: "+a);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the element to add at last position.");
		a.add(a.size(),s.next());
		System.out.println("Updated List: "+a );
	}

}
