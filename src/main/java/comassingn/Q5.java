//Write a Java program to shuffle elements in a array list
package comassingn;

import java.util.*;

public class Q5 {

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
		Collections.shuffle(a);
		System.out.println("Sorted List: "+a );
	}

}
