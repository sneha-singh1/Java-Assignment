//Write a Java program to sort a given array list
package comassingn;

import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a = new ArrayList<String>();
		a.add("a");
		a.add("B");
		a.add("c");
		a.add("d");
		a.add("Blue");
		a.add("Yellow");
		a.add("Orange");
		a.add("Green");	
		a.add("Violet");
		System.out.println("Original list: "+a);
		Collections.sort(a);
		System.out.println("Sorted List: "+a );
		
	}

}
